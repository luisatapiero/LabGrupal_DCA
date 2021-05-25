package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class HomeView {
	private ControllerMain controllermain;
	private PImage home;
	private PApplet app;

	public HomeView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		home = app.loadImage("img/Home.png");
	}

	// método para pintar la pantalla de signup
	public void drawScreen() {

		app.image(home, 0, 0);

	}

	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 3;

		return screen;
	}
}
