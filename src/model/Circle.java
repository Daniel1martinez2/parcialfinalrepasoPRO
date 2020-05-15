package model;

import processing.core.PApplet;

public class Circle extends Figure {

	public Circle(int posx, int posy, int tamx, int tamy, int color, PApplet app) {
		super(posx, posy, tamx, tamy, color, app);
	}

	public void run() {
		
	}

	public int compareTo(Figure o) {
		return this.tamx -o.getTamx();
	}
	


	public void pintar() {
		app.fill(color); 
		app.ellipse(posx, posy, tamx, tamy); 
		
	}
	



}
