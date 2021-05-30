package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PaymentView {

	private ControllerMain controllermain;
	private PApplet app;
	private PImage canasta;
	private PImage status;
	private PFont montserrat;

	public PaymentView(PApplet app) {
		controllermain = new ControllerMain(app);
		this.app = app;

		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);
		canasta = app.loadImage("Img/Canasta.png");
		status = app.loadImage("Img/Status.png");
	}

	public void drawScreen(int screen) {

		switch (screen) {
		case 9:
			app.image(canasta, 0, 0);
			controllermain.cartInfo(screen);
			break;
		case 11:
			app.image(status, 0, 0);
			break;

		default:
			break;
		}
		;
	}
	
	public int switchScreen(int screen) {

		if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY && screen == 9) {   
				screen = 11;	
			} 
		
		return screen;
	}

}
