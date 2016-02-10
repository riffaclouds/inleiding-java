package h2applets;

import java.awt.*;
import java.applet.*;

public class Nest extends Applet {
	
	public void init(){
		setSize(800, 400);
		setBackground(Color.white);
	}
	

	public void paint(Graphics g){
		int x = 10;
		int y = 30;
		String t = "These are my loops!"; //Titel van deze Applet		
		String brush;
		Color red = new Color(255, 0, 0);
		Color darkerRed = red.darker();
		
		Color blue = new Color(0, 0, 255);
		Color darkerBlue = blue.darker();
		

		
		
		g.drawString(t, 30, 15);
		
		for(int r = 0; r < 20; r++){
			y += 15;
			x = 10;
			
			
			for(int i = 0; i < getWidth(); i++){
				x += 50; //schuift de painter elke loop 10 pixels naar rechts
				
				if(i == 0 || i == 19 || r == 0 || r == 19){
					
					brush = "X+*+X";
					
				} else{
					
					brush = "XxXxXx";
				}
				if(i == 0 || i == 19 || r == 0 || r == 19){
				g.setColor(darkerRed);
				} else{
					
					
					
					g.setColor(darkerBlue);
				}
				g.drawLine(x, y-11, getWidth(), y-11); 
				
				
				
				g.drawString(brush, x, y);
				
				g.drawLine(x, y, getWidth(), y);
				
			}
			
		}	
	}
}

	