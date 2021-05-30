package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class HistoryView {
	PApplet app; 
    OrderView orderView;
    private ControllerMain controllermain;
    private PImage history1;

	public HistoryView(OrderView orderView , PApplet app) {
		this.app=app; 
        this.orderView = orderView; 
        controllermain = new ControllerMain(app);
        history1 = app.loadImage("Img/History.png");
		
	}
	public void drawHistory(int screen) {
		
		switch(screen) {
		
		case 10: 
			if (app.mouseX > 266 && 287 > app.mouseX && app.mouseY > 768 && 793 > app.mouseY ) {
				app.image(history1,0,0);
				
			}
		for (int i = 0; i < orderView.getControllermain().getHistory().size(); i++) {
            app.text(orderView.getControllermain().getHistory().get(i).getTotalPrice(), 30, 25 * i + 169);
            app.text(orderView.getControllermain().getHistory().get(i).getDate().toString(), 60 + 30, 25 * i + 169);
            app.text(orderView.getControllermain().getHistory().get(i).getId(), 281, 25 * i + 169);

        }
}
}
}


