package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class HomeView {
	private ControllerMain controllermain;
	private PImage home;
	private PApplet app;
	private ControlP5 cp5;

	public HomeView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		home = app.loadImage("img/Home.png");
		
		// inicializar cp5 y textfields
		cp5 = new ControlP5(app);
		
		//button bangs de la primera opci�n
		
				cp5.addBang("buttonHamburgueseria")
				.setPosition(34,124)
				.setSize(282,146)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
				;
		
	}

	// método para pintar la pantalla 
	public void drawScreen() {
		
		app.image(home, 0, 0);

	}
	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 3;

		buttonHamburgueseria();
		
		return screen;
	}
	
	
	
	
	public void hideCp5() {
		cp5.hide();

	}

	public void showCp5() {
		cp5.show();

	}
	
	public void buttonHamburgueseria() {                 
	
		int screen = 4;
		System.out.println();
	}
}
