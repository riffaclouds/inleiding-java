package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Diagram extends Applet {
	Button knop;
	Button vote;
	String schermtekst;
	TextField tekstvak;
	Label label;
	
	
	public void init() {
		//grote(x, y) van de applet window bepalen
		//configure the size of the applet window
		setSize(600, 600);
		
		//string object initialiseren
		schermtekst = "doet deze knop wel iets";
		
		//ruimte voor objecten laden in het geheugen
		label = new Label("label!");
		tekstvak = new TextField("naam", 6);
		knop = new Button("intelliJ rise to critical mass Lvl1");
		
		//knop linken aan ActionListener
		KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        
        //instanties van deze objecten toe voegen aan de applet! 
        //Enter the Matrix
        add(label);
        add(tekstvak);
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
