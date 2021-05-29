package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PaymentView {
	
	private ControllerMain controllermain;
	private PApplet app;
	private PImage canasta;
	private PFont montserrat;
	

	public PaymentView(PApplet app) {
		controllermain = new ControllerMain(app);
		this.app = app;
		
		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);
		canasta = app.loadImage("Img/Canasta.png");
	}
	
	
	public void drawScreen(int screen) {
		app.image(canasta, 0, 0);
		controllermain.cartInfo(screen);
	}
	
	
	

}
