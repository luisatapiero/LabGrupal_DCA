package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class OlderView {

	private ControllerMain controllermain;
	private PImage older;
	private PApplet app;
	
	public OlderView(PApplet app) {
		
		controllermain = new ControllerMain();
		this.app = app;

		older= app.loadImage("img/Older.png");
	
	}
	// método para pintar la pantalla 
	public void drawScreen() {
	
			app.image(older, 0, 0);
		

		
	}
	
}
