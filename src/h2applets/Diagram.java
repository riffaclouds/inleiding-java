package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Diagram extends Applet {
	Button knop;
	Button vote;
	String schermtekst;
	TextField tekstvak;
	
	
	public void init() {
		//grote(x, y) van de applet window bepalen
		//configure the size of the applet window
		setSize(600, 600);
		
		//string object initialiseren
		schermtekst = "doet deze knop wel iets";
		
		tekstvak = new TextField("klik op me", 20);
		add(tekstvak);
		
		knop = new Button("click for critical mass Lvl1");
		KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
		add(knop);
		
	}
	
	public void paint(Graphics g){
		//Voting Applet for the US elecetion 2016!
		
		
		
		
		//kandidaat 1
		setBackground(Color.white);
		g.setColor(Color.blue);
		g.fillRect(10, 200, 60, 100);
		g.drawString("Hillary Clinton", 5, 315);
		//kandidaat 2
		g.setColor(Color.red);
		g.fillRect(110, 200, 60, 100);
		g.drawString("Bernie Sanders", 105, 315);
		g.setColor(Color.black);
		g.drawLine(170, 35, 170, 320);
		
		g.drawString(schermtekst, 170, 50);
		
	}
	
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			schermtekst = "ja, ik kom uit een inwendige klasse!";
					
			//refesh the screen, making the change visible
			repaint();
		}
	}
	

}
