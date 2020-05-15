package model;

import processing.core.PApplet;

public abstract class Figure implements Runnable , Comparable<Figure> {
	
	protected PApplet app; 
	protected int posx, posy,  tamx, tamy, dirx, diry; 
	protected int color; 
	
	

	public Figure(int posx, int posy, int tamx, int tamy, int color, PApplet app) {
		
		this.app= app; 
		this.tamx= tamx; 
		this.tamy= tamy; 
		this.color= color; 
		dirx = 1; 
		diry = 1; 
		this.posx= posx; 
		this.posy= posy; 
		
	}
	
	public abstract void pintar(); 
	public void mover() {
		posx += 1*dirx; 
		posy+= 1*diry;
		
		if(posy<0||posy>app.height) {
			diry *=-1; 
		}
		if(posx <0||posx>app.width) {
			dirx*=-1; 
		}
	}
	//---------------------------------

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getTamx() {
		return tamx;
	}

	public void setTamx(int tamx) {
		this.tamx = tamx;
	}

	public int getTamy() {
		return tamy;
	}

	public void setTamy(int tamy) {
		this.tamy = tamy;
	}

	public int getDirx() {
		return dirx;
	}

	public void setDirx(int dirx) {
		this.dirx = dirx;
	}

	public int getDiry() {
		return diry;
	}

	public void setDiry(int diry) {
		this.diry = diry;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	
	

}
