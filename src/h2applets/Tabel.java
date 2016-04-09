package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Tabel extends Applet {
	double[] salaris;
	String[] earthling;
	
	public void init(){
		setBackground(Color.white);
		salaris = new double[6];
		earthling = new String[] {" Suzi ", " pipi ", " poepie "};


	}
	
	public void paint(Graphics g){
		int x = 10;
		int y = 15;

		/*
		g.drawString(earthling[0] + earthling[1] + earthling[2], x, y);
		y+=15;
		g.drawString(earthling[1], x, y);
		y+=15;
		g.drawString(earthling[2], x, y);
		*/

		
	}
}
