package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app; 
	Cuadrado a1; 
	String [] text1; 
	LinkedList<Figure> figuras = new LinkedList<Figure>(); 
	Colorcompare compaColor; 
	boolean stopall; 
	  

	public Logic(PApplet app) {
		this.app= app; 
		stopall = false; 
		
		compaColor = new Colorcompare(); 
	}
	
	
	
	
	public void setupmod() {
	
		
		
		String parto []; 
		 parto= app.loadStrings("../parcialfinalrepasopro/lib/textone.txt"); 
		 
		for (int i = 1; i < parto.length; i++) {
			String [] objeto = parto[i].split(","); 
			System.out.println(objeto[0]+"////"+ objeto[1]+"////"+objeto[2]+"////");
			if(objeto[0].equals("Círculo")) {
				figuras.add(new Cuadrado((int)app.random(0,500),(int)app.random(0,500), 
						Integer.parseInt(objeto[1]),
						Integer.parseInt(objeto[2]),(int)app.random(0,0x7FFF0000), app)); 
				
			}else {
				
				figuras.add(new Circle((int)app.random(0,500),(int)app.random(0,500), 
						Integer.parseInt(objeto[1]),
						Integer.parseInt(objeto[2]),(int)app.random(0,0x7FFF0000), app)); 
				
			}
		}
		
		a1 = new Cuadrado(100, 100, 100,100,-13312, app); 
		
		
		
		System.out.println(figuras.size());
		//System.out.println((float)app.random(0,0xffffff));
	}
	
	
	public void addonemore(int x, int y) {
		
		if(app.frameCount%2==0) {
			figuras.add(new Cuadrado(x,y, 
					(int)app.random(10,50),
					(int)app.random(10,50),(int)app.random(0,0x7FFF0000), app)); 
		}else {
			
			figuras.add(new Circle(x,y, 
					(int)app.random(10,50),
					(int)app.random(10,50),(int)app.random(0,0x7FFF0000), app)); 
			
			
		
			
		}
		
		
		
	}
	public void test1() {		
		//a1.pintar();
		for (Figure f : figuras) {
			f.pintar();
			
			if(!stopall) {
				//f.mover();
				new Thread(f).start();
			}
			
			
		}
		
		for (int i = 0; i < figuras.size(); i++) {
			for (int j = 0; j < figuras.size(); j++) {
				
				
				
				isnear(figuras.get(i), figuras.get(j));
				
			}
			
		}
	
	}
	
	public void sortList(char c) {
		switch (c) {
		case 'n':
			Collections.sort(figuras);
			System.out.println("orderno natural");
			for (Figure f : figuras) {
				System.out.println(f.getTamx());
				
			}
		
			
			
			break; 
		case 'p':
			Collections.sort(figuras, compaColor);
			System.out.println("orderno Parcial por color ---------");
			for (Figure f : figuras) {
				System.out.println(f.getColor());
				
			}
		
			
			
			break; 
		}
		}


	public Cuadrado getA1() {
		return a1;
	}


	public void setA1(Cuadrado a1) {
		this.a1 = a1;
	}
	
	public void isnear(Figure a, Figure b) {
		if(PApplet.dist(a.posx, a.posy, b.posx, b.posy)<=100 && a!=b) {
			app.fill(255);
			app.ellipse(a.posx, a.posy, 10, 10);
			app.line(a.posx, a.posy, b.posx, b.posy);
		}
		
		
		
	}




	public boolean isStopall() {
		return stopall;
	}




	public void setStopall(boolean stopall) {
		this.stopall = stopall;
	}

}
