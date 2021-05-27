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
	private PImage adic2;
	private PImage adic2b;
	private PImage adic3;
	private PImage adic3b;
	private PImage adic4;
	private PImage adic4b;
	private PApplet app;
	private boolean pressAdic1;
	private boolean pressAdic2;
	private boolean pressAdic3;
	private boolean pressAdic4;

	
	public OrderView(PApplet app) {
		
		controllermain = new ControllerMain();
		this.app = app;

		pressAdic1 = false;
		pressAdic2 = false;
		pressAdic3 = false;
		pressAdic4 = false;
		
		order1= app.loadImage("Img/Order1.png");
		adic1 = app.loadImage("Img/buttons/Adic1.png");
		adic1b = app.loadImage("Img/buttons/Adic1b.png");
		
		adic2 = app.loadImage("Img/buttons/Adic2.png");
		adic2b = app.loadImage("Img/buttons/Adic2b.png");
		
		adic3 = app.loadImage("Img/buttons/Adic3.png");
		adic3b = app.loadImage("Img/buttons/Adic3b.png");
		
		adic4 = app.loadImage("Img/buttons/Adic4.png");
		adic4b = app.loadImage("Img/buttons/Adic4b.png");
		
		
	
	}
	// método para pintar la pantalla 
	public void drawScreen() {
	
			app.image(order1, 0, 0);
			
			if (pressAdic1) {
				app.image(adic1b, 30, 454);
			}else {
				app.image(adic1, 30, 454);
			}

			if (pressAdic2) {
				app.image(adic2b, 108, 454);
			}else{
				app.image(adic2, 108, 454);
			}
			
			if (pressAdic3) {
				app.image(adic3b, 187, 454);
			}else{
				app.image(adic3, 187, 454);
			}
			
			if (pressAdic4) {
				app.image(adic4b, 265, 454);
			}else{
				app.image(adic4, 265, 454);
			}

		
	}
	

	
	public void pressButtons() {
		pressAdditions();
		
	}
	
	private void pressAdditions() {
		if (app.mouseX > 30 && 93 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic1 = !pressAdic1;
		}
		
		if (app.mouseX > 108 && 171 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic2 = !pressAdic2;
		}
		
		if (app.mouseX > 187 && 250 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic3 = !pressAdic3;
		}
		
		if (app.mouseX > 265 && 328 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic4 = !pressAdic4;
		}
	}
	
}
