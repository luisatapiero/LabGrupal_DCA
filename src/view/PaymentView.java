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
	
	
	public void drawScreen() {
		app.image(canasta, 0, 0);
		controllermain.paintCartinfo();
	}
	
	public void payFood(int screen) {
		if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY && screen == 9) {
			System.out.println("procesando pago");
			//controllermain.processPayment();
		}
	}

}
