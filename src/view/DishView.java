package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class DishView {
	private ControllerMain controllermain;
	private PImage Dish;
	private PApplet app;

	public DishView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		Dish = app.loadImage("img/Dish.png");
	}

	// método para pintar la pantalla de signup
	public void drawScreen() {

		app.image(Dish, 0, 0);

	}

	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 4;

		return screen;
	}
}
