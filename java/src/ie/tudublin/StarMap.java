package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {
	ArrayList<Star> star = new ArrayList<Star>();
	public void settings() {
		size(800, 800);
	}

	void loadStars()
	{
		Table table = loadTable("C:\\Users\\College\\OneDrive - Technological University Dublin\\Labs\\Year2\\Sem2\\Object Orientated Design\\Lab1\\OOP-2023\\java\\data\\HabHYG15ly.csv", "header");
		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			star.add(s);
		}
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();
		loadStars();
	}

	public void draw()
	{	
		strokeWeight(2);	
		drawGrid();
		drawStars();
	}

	public void drawStars() {
		for(Star s:star) {
			s.render(this);
		}
	}

	public void drawGrid(){
		stroke(255);

		float border = 50.f;

		int count = 10;

		float gap = (width - (border * 2.0f)) / (float) count;
		for (int i = -5;i <= 5; i++) {
			float x = border + (gap * (i + 5));
			line(x, border, x, height - border);
			line(border, x, width - border, x);
		}
	}
}
