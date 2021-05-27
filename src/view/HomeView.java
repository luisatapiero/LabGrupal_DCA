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
		
				cp5.addBang("button")
				.setPosition(240,240)
				.setSize(80,40)
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

		if (app.mouseX > 105 && 635 > app.mouseX && app.mouseY > 635 && 673 > app.mouseY) {
			screen = 4;
		}
		return screen;
	}
	
	
	
	
	public void hideCp5() {
		cp5.hide();

	}

	public void showCp5() {
		cp5.show();

	}
	
	public void button() {
	//	System.out.println(cp5.get(Textfield.class,"name").getText());
	}
}
