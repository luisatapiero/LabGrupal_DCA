package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class HistoryView {
	PApplet app;
	OrderView orderView;
	private ControllerMain controllermain;
	private PImage history1;
	private PImage history1_1;
	private PImage history1_2;
	private PFont montserrat;

	public HistoryView(OrderView orderView, PApplet app) {
		this.app = app;
		this.orderView = orderView;
		controllermain = new ControllerMain(app);
		history1 = app.loadImage("Img/History.png");
		history1_1 = app.loadImage("Img/history1_1.png");
		history1_2 = app.loadImage("Img/history1_2.png");
		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);

	}

	public void drawHistory(int screen) {
		app.textFont(montserrat);
		app.fill(0);
		switch (screen) {

		case 10:
			if (app.mouseX > 20 && 158 > app.mouseX && app.mouseY > 676 && 723 > app.mouseY) {
				app.image(history1_1, 0, 0);
			} else if (app.mouseX > 212 && 359 > app.mouseX && app.mouseY > 675 && 722 > app.mouseY) {
				app.image(history1_2, 0, 0);
			} else {
				app.image(history1, 0, 0);
			}

			for (int i = 0; i < controllermain.getHistory().size(); i++) {

				app.text("$ " + controllermain.getHistory().get(i).getTotalPrice(), 281, 25 * i + 169);
				app.text(controllermain.getHistory().get(i).getDate().toString(), 60, 25 * i + 169);
				app.text(controllermain.getHistory().get(i).getId(), 38, 25 * i + 169);

			}
		}
	}

	public void clickBottons(int screen) {
		controllermain.sortHistory(screen);
		drawHistory(screen);
	}
}
