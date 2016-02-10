package h2applets;

import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet{
	
	public void init(){
		setSize(600, 500);
		setBackground(Color.white);
	}
	
	public void paint(Graphics g){
		int x = 10;
		int y = 20;
		int current = 1;
		int last = 0;
		int lastLast;
		
		g.setColor(Color.black);
		setBackground(Color.cyan);
		
		//eerste 2 getallen tekenen
		g.drawString(String.valueOf(last), x, y); x+=5;
		g.drawString(String.valueOf(current), x, y+=20);
		
		
		//aantal Fibonacci getallen die worden getekent
		int times = 15;
		int second = 15;
		
		for(int i = 2; i < times; i++){
			lastLast = last;
			last = current;
			current  = lastLast + last;
			g.drawString(String.valueOf(current), x+=5, y+=20);
			
		}
		
		x=30; 
		y=0;
		
		for(int i = 2; i < second; i++){
			lastLast = last;
			last = current;
			current  = lastLast + last;
			g.drawString(String.valueOf(current), x+=5, y+=20);
			
		}
	}
	

}
