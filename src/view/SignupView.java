package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class SignupView {

	private ControllerMain controllermain;
	private PImage signup_1, signup_2;
	private PApplet app;

	public SignupView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		signup_1 = app.loadImage("img/SignUp_1.png");
		signup_2 = app.loadImage("img/SignUp_2.png");
	}

	// método para pintar la pantalla de signup
	public void drawScreen() {

		if (app.mouseX > 94 && 282 > app.mouseX && app.mouseY > 669 && 707 > app.mouseY) {
			app.image(signup_2, 0, 0);

		} else {
			app.image(signup_1, 0, 0);
		}

	}

	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 3;

		if (app.mouseX > 94 && 282 > app.mouseX && app.mouseY > 669 && 707 > app.mouseY) {
			screen = 1;
		}
		
		return screen;
	}

}
