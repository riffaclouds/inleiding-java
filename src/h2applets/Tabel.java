package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Tabel extends Applet {
	long[] salaris;
	String[] earthling;
	long maximum;
	
	public void init(){
		setBackground(Color.white);
		salaris = new long[10];

		//maximum = salaris[0];

		earthling = new String[] {" Suzi ", " piepi ", " poepie "};


		for (int teller = 0; teller < salaris.length; teller ++) {
			salaris[teller] = 100 * teller + 100;
		}

		salaris[0] = 3000;
		salaris[1] = 30000;
		salaris[2] = 1250000;

		maximum = salaris[0];
		for	(int teller = 0; teller < salaris.length; teller ++){
			if(salaris[teller] > maximum){
				maximum = salaris[teller];
			}
		}


	}
	
	public void paint(Graphics g){
		int x = 10;
		int y = 15;

		//print out suzi's name
		//g.drawString(earthling[0] + earthling[1] + earthling[2], x, y);
		//g.drawString("" + salaris[0] + " " + salaris[1] + " " +  salaris[2], x, y);

		for (int teller = 0; teller < salaris.length; teller ++) {
			g.drawString("" + salaris[teller], 10, 20 * teller + 20);
		}

		//x+=5;
		y+=200;
		g.drawString("Het maximum is: " + maximum, x, y);



	}
}
