package view;

import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class DishView {
	private ControllerMain controllermain;
	private PImage dish_1,dish_2,dish_3,dish_4,dish_5;
	private PApplet app;

	public DishView(PApplet app) {
		// TODO Auto-generated constructor stub
		controllermain = new ControllerMain(app);
		this.app = app;

		dish_1 = app.loadImage("img/Dish_1.png");
		dish_2 = app.loadImage("img/Dish_2.png");
		dish_3 = app.loadImage("img/Dish_3.png");
		dish_4 = app.loadImage("img/Dish_4.png");
		dish_5 = app.loadImage("img/Dish_5.png");
	}

	// método para pintar la pantalla 
	public void drawScreen() {

		if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 213 && 328 > app.mouseY) {
			app.image(dish_2, 0, 0);

		} else if(app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 335 && 457 > app.mouseY) {
			app.image(dish_3, 0, 0);
			
		} else if(app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 471 && 588 > app.mouseY) {
			app.image(dish_4, 0, 0);
			
		}  else if(app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 603 && 717 > app.mouseY) {
			app.image(dish_5, 0, 0);
		}
		else {
			app.image(dish_1, 0, 0);
		}
		
		
	}

	public int switchScreen(int screen) {


		if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 213 && 328 > app.mouseY) {
			screen = 5;	
		}	
		   else if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 335 && 457 > app.mouseY) {   
			screen = 6;	
		} 
		
		   else if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 472 && 588 > app.mouseY) {   
				screen = 7;	
			} 
		
		   else if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 603 && 717 > app.mouseY) {   
				screen = 8;	
			} 
		
		   else if (app.mouseX > 34 && 346 > app.mouseX && app.mouseY > 603 && 717 > app.mouseY) {   
				screen = 9;	
			} 
		
		

		return screen;
	}
}
