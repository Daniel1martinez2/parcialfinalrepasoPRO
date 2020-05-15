package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	Logic logic; 
	PApplet app; 
	

	public Controller(PApplet app) {
		this.app= app; 
		// TODO Auto-generated constructor stub
		logic = new Logic(app); 
	}
	
	
	public void setupmod() {
		logic.setupmod();
		
	}
	
	public void test1() {
		logic.test1();
	}
	
	public void addonemore(int x, int y) {
		logic.addonemore(x, y);
	}
	public boolean isStopall() {
		return logic.isStopall();
	}

	public void setStopall(boolean stopall) {
		logic.setStopall(stopall);
	}
	
	public void sortList(char c) {
		logic.sortList(c);
	}

}
