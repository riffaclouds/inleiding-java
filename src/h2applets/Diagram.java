package h2applets;

import java.awt.*;
import java.applet.*;


public class Diagram extends Applet {
	
	public void init() {
		setSize(400, 400);
	}
	
	public void paint(Graphics g){
		//Voting Applet for the US elecetion 2016!
		//1
		setBackground(Color.white);
		g.setColor(Color.blue);
		g.fillRect(10, 200, 60, 100);
		g.drawString("Hillary Clinton", 5, 315);
		//2
		g.setColor(Color.red);
		g.fillRect(110, 200, 60, 100);
		g.drawString("Bernie Sanders", 105, 315);
		
	}
	

}
