package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{
	LifeBoard board;
	int size = 100;

	public void settings()
	{
		size(1000, 1000);
	}

	@Override
	public void mouseDragged() {
		int row = (int) PApplet.map(mouseX, 0 , width - 1, 0, size - 1 );
        int col = (int) PApplet.map(mouseY, 0 , height - 1, 0, size - 1 );

        board.board[col][row] = true;
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		board = new LifeBoard(size, this);
		board.randomise();
	}

	public void draw()
	{	
		background(0);
		board.render();
		board.applyRules();
	}
}
