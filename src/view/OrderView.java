package view;

import controlP5.ControlEvent;
import controlP5.ControlP5;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class OrderView {

	private ControllerMain controllermain;
	private PImage order1;
	private PImage adic1;
	private PImage adic1b;
	private PApplet app;

	
	public OrderView(PApplet app) {
		
		controllermain = new ControllerMain();
		this.app = app;

		
		order1= app.loadImage("Img/Order1.png");
		adic1 = app.loadImage("Img/buttons/Adic1.png");
		adic1b = app.loadImage("Img/buttons/Adic1b.png");
		
		
	
	}
	// método para pintar la pantalla 
	public void drawScreen() {
	
			app.image(order1, 0, 0);
			
			if (pressButtons()) {
				app.image(adic1b, 30, 454);
			}else {
				app.image(adic1, 30, 454);
			}
			

		
	}
	

	
	public boolean pressButtons() {
		if (app.mouseX > 30 && 93 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			//app.image(adic1b, 30, 454);
			System.out.println("presiono");
			return true;
		} else {
			//app.image(adic1, 30, 454);
			return false;
		}
		
	}
	
}
