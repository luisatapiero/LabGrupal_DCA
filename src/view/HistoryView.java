package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class HistoryView {
	PApplet app; 
    OrderView orderView;
    private ControllerMain controllermain;

	public HistoryView(OrderView orderView , PApplet app) {
		this.app=app; 
        this.orderView = orderView; 
        controllermain = new ControllerMain(app);
		
	}
	public void drawHistory() {
		for (int i = 0; i < orderView.getControllermain().getHistory().size(); i++) {
            app.text(orderView.getControllermain().getHistory().get(i).getTotalPrice(), 30, 25 * i + 169);
            app.text(orderView.getControllermain().getHistory().get(i).getDate().toString(), 60 + 30, 25 * i + 169);
            app.text(orderView.getControllermain().getHistory().get(i).getId(), 281, 25 * i + 169);

        }
}
}


