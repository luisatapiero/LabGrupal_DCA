package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class LoginView {

	private ControllerMain controllermain;
	private PImage login_1, login_2, login_notification;
	private PApplet app;

	public LoginView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;

		login_1 = app.loadImage("img/LogIn_1.png");
		login_2 = app.loadImage("img/LogIn_2.png");
		login_notification = app.loadImage("img/LogIn_Notification.png");

	}

	// método para pintar la pantalla de login
	public void drawScreen() {

		if (app.mouseX > 105 && 635 > app.mouseX && app.mouseY > 635 && 673 > app.mouseY) {
			app.image(login_2, 0, 0);

		} else {
			app.image(login_1, 0, 0);
		}

	}

	// método para pasar de pantalla
	public int switchScreen() {
		int screen = 1;

		if (app.mouseX > 105 && 635 > app.mouseX && app.mouseY > 635 && 673 > app.mouseY) {
			screen = 3;
		}
		if (app.mouseX > 212 && 248 > app.mouseX && app.mouseY > 686 && 702 > app.mouseY) {
			screen = 2;
		}
		return screen;
	}

}
