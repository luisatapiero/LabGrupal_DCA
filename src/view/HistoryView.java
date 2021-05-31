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
	private PFont montserrat;

	public HistoryView(OrderView orderView, PApplet app) {
		this.app = app;
		this.orderView = orderView;
		controllermain = new ControllerMain(app);
		history1 = app.loadImage("Img/History.png");
		montserrat = app.createFont("Fonts/Montserrat-Regular.ttf", 14);

	}

	public void drawHistory(int screen) {

		switch (screen) {

		case 10:
			
			app.image(history1, 0, 0);

			for (int i = 0; i < controllermain.getHistory().size(); i++) {

				app.text(controllermain.getHistory().get(i).getTotalPrice(), 30, 25 * i + 169);
				app.text(controllermain.getHistory().get(i).getDate().toString(), 60 + 30, 25 * i + 169);
				app.text(controllermain.getHistory().get(i).getId(), 281, 25 * i + 169);

			}
		}
	}
	
	public void clickBottons(int screen) {
			controllermain.sortHistory(screen);
			drawHistory(screen);
	}
}
