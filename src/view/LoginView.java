package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class LoginView {

	private ControllerMain controllermain;
	private PImage login_1, login_2, login_notification;
	private PApplet app;

	private ControlP5 cp5;
	private PFont montserrat;
	private String[] inputs;
	private String email;
	private String password;

	public LoginView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain();
		this.app = app;
		controllermain.firstUser(app);

		login_1 = app.loadImage("img/LogIn_1.png");
		login_2 = app.loadImage("img/LogIn_2.png");
		login_notification = app.loadImage("img/LogIn_Notification.png");
		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);

		// inicializar cp5 y textfields
		cp5 = new ControlP5(app);
		inputs = new String[2];
		inputs[0] = "email";
		inputs[1] = "password";

		// personalziar textfields
		cp5.addTextfield(inputs[0]).setPosition(71, 453).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition(71, 544).setSize(232, 38).setPasswordMode(true).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

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
			//screen = 3;
			boolean capturelogin = login();
			if (capturelogin == true) {
				screen = 3;
			}else {
				//lanzar excepción
				System.out.println("usuario no existe");
			}
		}
		if (app.mouseX > 212 && 248 > app.mouseX && app.mouseY > 686 && 702 > app.mouseY) {
			screen = 2;
		}
		return screen;
	}

	// método para validar ingreso
	public boolean login() {
		boolean login = false;
		email = cp5.get(Textfield.class, "email").getText();
		password = cp5.get(Textfield.class, "password").getText();
		System.out.println(email + " " + password);
		login = controllermain.login(email, password);
		return login;

	}

}
