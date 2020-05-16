package model;

import processing.core.PApplet;

public class Cuadrado  extends Figure{

	public Cuadrado(int posx, int posy, int tamx, int tamy, int color, PApplet app) {
		super(posx, posy, tamx, tamy, color, app);
	}

	public void run() {
		try {
			mover(); 
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public int compareTo(Figure o) {
		return this.tamx -o.getTamx();
	}

	public void pintar() {
		app.fill(color); 
		app.rect(posx, posy, tamx, tamy); 
		
	}


}
