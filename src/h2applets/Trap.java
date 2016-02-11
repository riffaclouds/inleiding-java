package h2applets;


import java.awt.*;
import java.applet.*;

public class Trap extends Applet{
	
	public void init(){
		setSize(500, 500);
		setBackground(Color.white);
	}
	
	public void paint(Graphics g){
		int x = 10;
		int y = 20;
		
		
		for(int i = 0; i < 5; i++){
			g.drawRect(x+=50, y+=50, 50, 50);
		}
		
	}

}
