package view;

import controlP5.ControlEvent;
import controlP5.ControlP5;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class OrderView {

	private ControllerMain controllermain;
	private PImage order1, order1_1, order2, order3, order4, order2_1, order3_1, order4_1;
	private PImage status;

	private PImage adic1, adic1b, adic2, adic2b, adic3, adic3b, adic4, adic4b, acom1, acom1b, acom2, acom2b, acom3,
			acom3b, acom4, acom4b;
	private PApplet app;
	private boolean pressAdic1;
	private boolean pressAdic2;
	private boolean pressAdic3;
	private boolean pressAdic4;
	private boolean pressAcom1;
	private boolean pressAcom2;
	private boolean pressAcom3;
	private boolean pressAcom4;
	
	private boolean change;

	private String name;
	private int price;

	public OrderView(PApplet app) {

		controllermain = new ControllerMain(app);
		this.app = app;

		pressAdic1 = false;
		pressAdic2 = false;
		pressAdic3 = false;
		pressAdic4 = false;
		pressAcom1 = false;
		pressAcom2 = false;
		pressAcom3 = false;
		pressAcom4 = false;
		change = false;

		price = 0;
		name = "";
		order1 = app.loadImage("Img/Order1.png");
		order1_1 = app.loadImage("Img/Order1_1.png");
		order2 = app.loadImage("Img/Order2.png");
		order2_1 = app.loadImage("Img/Order2_1.png");
		order3 = app.loadImage("Img/Order3.png");
		order3_1 = app.loadImage("Img/Order3_1.png");
		order4 = app.loadImage("Img/Order4.png");
		order4_1 = app.loadImage("Img/Order4_1.png");

		order2 = app.loadImage("Img/Order2.png");

		order3 = app.loadImage("Img/Order3.png");

		order4 = app.loadImage("Img/Order4.png");

		adic1 = app.loadImage("Img/buttons/Adic1.png");
		adic1b = app.loadImage("Img/buttons/Adic1b.png");

		adic2 = app.loadImage("Img/buttons/Adic2.png");
		adic2b = app.loadImage("Img/buttons/Adic2b.png");

		adic3 = app.loadImage("Img/buttons/Adic3.png");
		adic3b = app.loadImage("Img/buttons/Adic3b.png");

		adic4 = app.loadImage("Img/buttons/Adic4.png");
		adic4b = app.loadImage("Img/buttons/Adic4b.png");

		acom1 = app.loadImage("Img/buttons/Acom1.png");
		acom1b = app.loadImage("Img/buttons/Acom1b.png");

		acom2 = app.loadImage("Img/buttons/Acom2.png");
		acom2b = app.loadImage("Img/buttons/Acom2b.png");

		acom3 = app.loadImage("Img/buttons/Acom3.png");
		acom3b = app.loadImage("Img/buttons/Acom3b.png");

		acom4 = app.loadImage("Img/buttons/Acom4.png");
		acom4b = app.loadImage("Img/buttons/Acom4b.png");
		status = app.loadImage("Img/Status.png");

	}

	// mÃ©todo para pintar la pantalla
	public void drawScreen(int screen) {

		switch (screen) {

		case 5:
			change = false;
			name = "Hamburguesa Clásica";
			price = 12900;
			if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {
				app.image(order1_1, 0, 0);
			} else {
				app.image(order1, 0, 0);
			}

			break;

		case 6:
			change = false;
			price = 14900;
			name = "Hamburguesa Americana";

			if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {
				app.image(order2_1, 0, 0);
			} else {
				app.image(order2, 0, 0);
			}
			break;

		case 7:
			change = false;
			price = 42800;
			name = "Combo Doble";

			if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {
				app.image(order3_1, 0, 0);
			} else {
				app.image(order3, 0, 0);
			}
			break;

		case 8:
			change = false;
			price = 59900;
			name = "Combo Triple";

			if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {
				app.image(order4_1, 0, 0);
			} else {
				app.image(order4, 0, 0);
			}
			break;

		case 9:
		

			break;

		default:
			break;
		}

		changeButton();

	}

	public void pressButtons(int screen) {
		pressAdditions();
		pressAcom();
		addDish(screen);
		

	}
	
	public int changeScreenAdd(int screen) {
		if (change) {
			screen = 4;
		}
		change = false;
		return screen;
	}

	private void pressAdditions() {
		if (app.mouseX > 30 && 93 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic1 = !pressAdic1;
		}

		if (app.mouseX > 108 && 171 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic2 = !pressAdic2;
		}

		if (app.mouseX > 187 && 250 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic3 = !pressAdic3;
		}

		if (app.mouseX > 265 && 328 > app.mouseX && app.mouseY > 454 && 520 > app.mouseY) {
			pressAdic4 = !pressAdic4;
		}
	}

	private void pressAcom() {
		if (app.mouseX > 30 && 93 > app.mouseX && app.mouseY > 583 && 649 > app.mouseY) {
			pressAcom1 = !pressAcom1;
		}

		if (app.mouseX > 108 && 171 > app.mouseX && app.mouseY > 583 && 649 > app.mouseY) {
			pressAcom2 = !pressAcom2;
		}

		if (app.mouseX > 187 && 250 > app.mouseX && app.mouseY > 583 && 649 > app.mouseY) {
			pressAcom3 = !pressAcom3;
		}

		if (app.mouseX > 265 && 328 > app.mouseX && app.mouseY > 583 && 649 > app.mouseY) {
			pressAcom4 = !pressAcom4;
		}
	}

	private void changeButton() {
		if (pressAdic1) {
			app.image(adic1b, 30, 454);
		} else {
			app.image(adic1, 30, 454);
		}

		if (pressAdic2) {
			app.image(adic2b, 108, 454);
		} else {
			app.image(adic2, 108, 454);
		}

		if (pressAdic3) {
			app.image(adic3b, 187, 454);
		} else {
			app.image(adic3, 187, 454);
		}

		if (pressAdic4) {
			app.image(adic4b, 265, 454);
		} else {
			app.image(adic4, 265, 454);
		}

		if (pressAcom1) {
			app.image(acom1b, 30, 583);
		} else {
			app.image(acom1, 30, 583);
		}

		if (pressAcom2) {
			app.image(acom2b, 108, 583);
		} else {
			app.image(acom2, 108, 583);
		}

		if (pressAcom3) {
			app.image(acom3b, 187, 583);
		} else {
			app.image(acom3, 187, 583);
		}

		if (pressAcom4) {
			app.image(acom4b, 265, 583);
		} else {
			app.image(acom4, 265, 583);
		}
	}

	private void addDish(int screen) {
		if (app.mouseX > 27 && 348 > app.mouseX && app.mouseY > 675 && 723 > app.mouseY) {
			controllermain.addCart(name, price, screen);
			change = true;
		}
		
	}

	public void setPressAdic1(boolean pressAdic1) {
		this.pressAdic1 = pressAdic1;
	}

	public void setPressAdic2(boolean pressAdic2) {
		this.pressAdic2 = pressAdic2;
	}

	public void setPressAdic3(boolean pressAdic3) {
		this.pressAdic3 = pressAdic3;
	}

	public void setPressAdic4(boolean pressAdic4) {
		this.pressAdic4 = pressAdic4;
	}

	public void setPressAcom1(boolean pressAcom1) {
		this.pressAcom1 = pressAcom1;
	}

	public void setPressAcom2(boolean pressAcom2) {
		this.pressAcom2 = pressAcom2;
	}

	public void setPressAcom3(boolean pressAcom3) {
		this.pressAcom3 = pressAcom3;
	}

	public void setPressAcom4(boolean pressAcom4) {
		this.pressAcom4 = pressAcom4;
	}

	public ControllerMain getControllermain() {
		return controllermain;
	}

	public void setControllermain(ControllerMain controllermain) {
		this.controllermain = controllermain;
	}

}
