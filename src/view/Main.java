package view;

import processing.core.PApplet;

public class Main extends PApplet {

	private int screen;
	private LoginView loginview;
	private SignupView signupview;
	private HomeView homeview;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		// TODO Auto-generated method stub

		// Prueba de git
		// Login completo
	}

	public void settings() {
		size(375, 812);

	}

	public void setup() {

		screen = 1;
		loginview = new LoginView(this);
		signupview = new SignupView(this);
		homeview = new HomeView(this);

	}

	public void draw() {
		background(0);

		switch (screen) {
		case 1:
			loginview.drawScreen();
			loginview.showCp5();
			signupview.hideCp5();
			break;
		case 2:
			signupview.drawScreen();
			loginview.hideCp5();
			signupview.showCp5();
			break;
		case 3:
			homeview.drawScreen();
			loginview.hideCp5();
			signupview.hideCp5();
			break;
			
		default:
			break;
		}
		fill(0);
		text("x:" + mouseX + "y:" + mouseY, mouseX, mouseY);
	}

	public void mousePressed() {
		switch (screen) {
		case 1:
			screen = loginview.switchScreen();
			signupview.emptyTextfields();
			//System.out.println(screen);
			break;
		case 2:
			screen = signupview.switchScreen();
			loginview.emptyTextfields();
			//System.out.println(screen);
			break;
		case 3:
			screen = homeview.switchScreen();
			//System.out.println(screen);
			break;
		

		default:
			break;
		}
	}

}
