package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio1 extends PApplet
{

	Minim m;
	AudioInput ai;
	AudioPlayer ap;
	AudioBuffer ab;
	FFT fft;

	public void settings() {
		size(1024, 1024, P3D);
	} //

	public void setup() {
		m = new Minim(this);
		ai = m.getLineIn(Minim.MONO, width, 44100, 16);
		ab = ai.mix;

		fft = new FFT(width, 44100);

	}

	public void draw() {	
		background(0);

		drawFFT();
	} // End draw

	public void drawMic()
 	{
		float half = (float)height / 2;
		stroke(255);
		for(int i = 0; i < ab.size(); i++) {
			line(i, half, i, half + ab.get(i) * i);
		} // End fo
 	}

	float learpedY = 0;
	public void drawFFT() {
		fft.forward(ab);

		int highestIndex = 0;

		for(int i = 0; i < fft.specSize(); i++) {
			if(highestIndex < fft.getBand(i)) {
				highestIndex = i;
			} // End if 

			stroke(255);
			line(i, (height / 2), i ,(height / 2) - fft.getBand(i) * 10.0f);
		} // End for

		float highestFreq = fft.indexToFreq(highestIndex);
		fill(255, 255, 255);
		text("Freq: " + str(highestFreq), 50, 50);

		float y = map(highestFreq, 1000.0f, 2500.0f, height, 0);
		learpedY = lerp(learpedY, y, 0.1f);
		circle(width / 2, learpedY, 50);
	} // End
}
