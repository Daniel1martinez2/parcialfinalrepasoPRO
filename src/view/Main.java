package view;

import controller.Controller;
import myExceptions.Exception1;
import processing.core.PApplet;

public class Main extends PApplet{
	
	Controller control; 
	boolean stoped; 

	public static void main(String[] args) {
		PApplet.main("view.Main");
		

	}
	public void settings() {
		size(500,500); 

	}

	public void setup() {
		control = new Controller(this); 
		control.setupmod();
		
		stoped = false; 

	}

	public void draw() {
		background(-13312); 
		control.test1(); 
	
		

	}
	
	public void mousePressed() {
		control.addonemore(mouseX, mouseY);
		if(mouseButton == RIGHT) {
			control.setStopall(!control.isStopall());
			stoped = !stoped; 
		}
	}
	
	public void keyPressed() {
		
		try {
			kieroComparar (); 
			control.sortList(key);
		} catch (Exception e) {
			fill(255); 
			System.out.println(e.getMessage()+"---------------------------------------------------------------");
			
			
		}
		
	}
	
	public void kieroComparar ()throws Exception1  {
		
		if(stoped) {
			throw new Exception1("viernes en la noche "); 
			
		}
		
		
	}

}
