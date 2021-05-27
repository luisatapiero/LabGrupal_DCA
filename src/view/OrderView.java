package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class OrderView {

	private ControllerMain controllermain;
	private PImage order1;
	private PApplet app;
	
	public OrderView(PApplet app) {
		
		controllermain = new ControllerMain();
		this.app = app;

		order1= app.loadImage("img/Order1.png");
	
	}
	// método para pintar la pantalla 
	public void drawScreen() {
	
			app.image(order1, 0, 0);
		

		
	}
	
}
