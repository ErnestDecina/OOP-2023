package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	// Private Variables
	int mode = 0;
	int height = 1000;
	int width = 1000;
	long radius = 10;
	int changeColour = 1;


	public void settings() {
		size(width, height);
	}

	public void setup() {
		colorMode(HSB);
	}



	public void keyPressed() {
		
		mode = key - '0';
		println(mode);
	}

	public void draw() {
		background(0);
		forLoop();
	}

	public void forLoop() {
		for (int j = 0; j < 1000 / (radius * 2); j++) {
			for (int i = 0; i < (1000 / radius * 2); i++) {
				fill((i + j + changeColour) % 255, 255, 255);
				circle(radius + (radius * 2 * i), radius + (radius * 2 * j), radius * 2);
			}
		}


		changeColour();
	}

	public void changeColour() {
			

		changeColour = (changeColour + 1) % 256;
	}	
}
