package ie.tudublin;

import com.jogamp.nativewindow.util.Rectangle;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{
	int screenWidth = 500;
	int screenHeight = 500;

	public void settings()
	{
		size(screenWidth, screenHeight);
	}

	public void setup() {
		// colorMode(HSB);
		background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		background(255, 0, 0);

		// Circle
		stroke(0);
		strokeWeight(0);
		fill(255, 255, 0);
		circle(screenWidth / 2, screenHeight / 2, 425);

		// Triangle
		stroke(0);
		strokeWeight(0);
		fill(0, 0, 255);
		triangle(screenWidth / 2, 0, 10, screenHeight - 80, 490, screenHeight - 80);
		
		// Eye
		stroke(0);
		strokeWeight(0);
		fill(255, 255, 255);

		if (mousePressed) {
			ellipse((screenWidth / 2), (screenHeight / 2) - 40, 0, 0);
		}
		else {
			ellipse((screenWidth / 2), (screenHeight / 2) - 40, 230, 100);	
		}
		
		// Eye Pupil
		stroke(0);
		strokeWeight(0);
		fill(0, 0, 0);
		if (mousePressed) {
			circle((screenWidth / 2), (screenHeight / 2) - 40, 0);
		}
		else {
			circle((screenWidth / 2), (screenHeight / 2) - 40, 50);	
		}
 	}
}
