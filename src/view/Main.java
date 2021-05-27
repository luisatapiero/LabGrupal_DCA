package view;

import controlP5.ControlP5;
import processing.core.PApplet;

public class Main extends PApplet {

	private int screen;
	private LoginView loginview;
	private SignupView signupview;
	private HomeView homeview;
	private DishView dishview;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		// TODO Auto-generated method stub

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
		dishview = new DishView(this);
		
		

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
			loginview.hideCp5();    // Oculta un objeto pero no lo descarga.
			signupview.showCp5();   //metodo para cuando este en un pantalla se muestre
			break;
		case 3:
			homeview.drawScreen();
			loginview.hideCp5();
			signupview.hideCp5();
			break;
		case 4:
			dishview.drawScreen();
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
		case 4:
			screen = dishview.switchScreen();
			//System.out.println(screen);
			break;

		default:
			break;
		}
	}

}
