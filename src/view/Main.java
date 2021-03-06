package view;

import controlP5.ControlP5;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	private int screen;
	private LoginView loginview;
	private SignupView signupview;
	private HomeView homeview;
	private DishView dishview;
	private OrderView orderview;
	private PaymentView paymentview;
	private ControllerMain controllermain;
	private HistoryView history;
	private PImage leave;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

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
		orderview = new OrderView(this);
		paymentview = new PaymentView(this);
		controllermain = new ControllerMain(this);
		history = new HistoryView(orderview, this);
		leave = loadImage("Img/orderStatus.png");

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
			loginview.hideCp5(); // Oculta un objeto pero no lo descarga.
			signupview.showCp5(); // metodo para cuando este en un pantalla se muestre
			break;
		case 3:
			homeview.drawScreen();
			loginview.hideCp5();
			signupview.hideCp5();
			clearAdditions();
			// Imagen de cerrar sesion
			image(leave, 24, 11, 25, 25);

			break;
		case 4:
			clearAdditions();
			dishview.drawScreen();
			break;
		case 5:
			orderview.drawScreen(screen);
			break;
		case 6:
			orderview.drawScreen(screen);
			break;

		case 7:
			orderview.drawScreen(screen);
			break;

		case 8:
			orderview.drawScreen(screen);
			break;

		case 9:
			paymentview.drawScreen(screen);

			break;

		case 10:
			history.drawHistory(screen);
			break;
		case 11:
			paymentview.drawScreen(screen);
			break;

		default:
			break;
		}

	}

	public void mousePressed() {
		menu();

		switch (screen) {
		case 1:
			screen = loginview.switchScreen();
			signupview.emptyTextfields();
			// System.out.println(screen);
			break;
		case 2:
			screen = signupview.switchScreen();
			loginview.emptyTextfields();
			// System.out.println(screen);
			break;
		case 3:
			screen = homeview.switchScreen();

			break;
		case 4:
			screen = dishview.switchScreen(screen);
			break;
		case 5:
			orderview.pressButtons(screen);
			screen = orderview.changeScreenAdd(screen);
			break;
		case 6:

			orderview.pressButtons(screen);
			screen = orderview.changeScreenAdd(screen);

			break;

		case 7:

			orderview.pressButtons(screen);
			screen = orderview.changeScreenAdd(screen);

			break;

		case 8:

			orderview.pressButtons(screen);
			screen = orderview.changeScreenAdd(screen);

			break;

		case 9:
			orderview.pressButtons(screen);
			screen = paymentview.switchScreen(screen);

			break;

		case 10:

			orderview.pressButtons(screen);
			history.clickBottons(screen);

			break;

		default:
			break;
		}
	}

	private void clearAdditions() {
		orderview.setPressAcom1(false);
		orderview.setPressAcom2(false);
		orderview.setPressAcom3(false);
		orderview.setPressAcom4(false);
		orderview.setPressAdic1(false);
		orderview.setPressAdic2(false);
		orderview.setPressAdic3(false);
		orderview.setPressAdic4(false);
	}

	private void menu() {
		if (mouseX > 88 && 113 > mouseX && mouseY > 768 && 791 > mouseY) { // esta parte permite que al seleccional el
			// icono de home se pueda regresar a esa
			// pantalla
			screen = 3;

		}

		if (mouseX > 24 && 50 > mouseX && mouseY > 11 && 35 > mouseY && screen == 3) {
			System.out.println("te saliste");
			screen = 1;
			for (int i = 0; i < controllermain.getHistory().size(); i++) {
				controllermain.getHistory().clear();
			}
		}

		if (mouseX > 174 && 204 > mouseX && mouseY > 767 && 794 > mouseY) {
			screen = 9;
		}

		if (mouseX > 266 && 287 > mouseX && mouseY > 768 && 793 > mouseY) {
			screen = 10;
		}
	}
}
