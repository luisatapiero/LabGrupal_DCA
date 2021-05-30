package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class SignupView {

	private ControllerMain controllermain;
	private PImage signup_1, signup_2;
	private PApplet app;

	private ControlP5 cp5;
	private PFont montserrat;
	private String[] inputs;
	private String name;
	private String lastname;
	private String city;
	private String address;
	private String email;
	private String password;

	public SignupView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain(app);
		this.app = app;

		signup_1 = app.loadImage("img/SignUp_1.png");
		signup_2 = app.loadImage("img/SignUp_2.png");
		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);

		// inicializar cp5 y textfields
		cp5 = new ControlP5(app);
		inputs = new String[6];
		inputs[0] = "name";
		inputs[1] = "lastname";
		inputs[2] = "city";
		inputs[3] = "address";
		inputs[4] = "email";
		inputs[5] = "password";

		// personalziar textfields
		cp5.addTextfield(inputs[0]).setPosition(73, 123).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[1]).setPosition(71, 214).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[2]).setPosition(71, 305).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[3]).setPosition(71, 396).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[4]).setPosition(71, 487).setSize(232, 38).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();

		cp5.addTextfield(inputs[5]).setPosition(71, 578).setSize(232, 38).setPasswordMode(true).setAutoClear(true)
				.setColorValue(app.color(255)).setColorActive(app.color(0, 0, 0, 1))
				.setColorBackground(app.color(0, 0, 0, 1)).setColorForeground(app.color(0, 0, 0, 1))
				.setColor(app.color(0, 0, 0, 255)).setColorCursor(app.color(0, 0, 0, 255)).setFont(montserrat)
				.getCaptionLabel().hide();
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
		int screen = 2;

		if (app.mouseX > 94 && 282 > app.mouseX && app.mouseY > 669 && 707 > app.mouseY) {
			registerUser();
			screen = 1;
		}

		return screen;
	}

	private void registerUser() {
		name = cp5.get(Textfield.class, "name").getText();
		lastname = cp5.get(Textfield.class, "lastname").getText();
		city = cp5.get(Textfield.class, "city").getText();
		address = cp5.get(Textfield.class, "address").getText();
		email = cp5.get(Textfield.class, "email").getText();
		password = cp5.get(Textfield.class, "password").getText();
		System.out.println(name + " " + lastname + " " + city + " " + address + " " + email + " " + password);
		controllermain.registerUser(app,name,lastname,city,address,email,password);
	}

	public void hideCp5() {
		cp5.hide();
	}

	public void showCp5() {
		cp5.show();

	}

	public void emptyTextfields() {
		cp5.get(Textfield.class, "name").setText("");
		cp5.get(Textfield.class, "lastname").setText("");
		cp5.get(Textfield.class, "city").setText("");
		cp5.get(Textfield.class, "address").setText("");
		cp5.get(Textfield.class, "email").setText("");
		cp5.get(Textfield.class, "password").setText("");

	}

}
