package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class HomeView {
	private ControllerMain controllermain;
	private PImage home_1,home_2;
	private PApplet app;


	public HomeView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		home_1 = app.loadImage("img/Home_1.png");
		home_2 = app.loadImage("img/Home_2.png");
		
		
		
		//button bangs de la primera opci�n
		
		
		
	}

	// método para pintar la pantalla home
	public void drawScreen() {
		
	
		if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 146 && 282 > app.mouseY) {
			app.image(home_2, 0, 0);

		} else {
			app.image(home_1, 0, 0);
		}


	}
	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 4;

		if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 146 && 282 > app.mouseY) {
			// screen = 3;
			boolean capturehome = home();
			if (capturehome == true) {
				screen = 4;
			} 
		}	
		return screen;
	}
	
	public boolean home() {
		boolean home = false;
		return home;

	}
	
	
	
	
	
}
