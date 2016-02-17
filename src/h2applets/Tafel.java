package h2applets;

import h2applets.Diagram.KnopListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Tafel extends Applet {
	int tG;
	String iTG;
	int iN;
	int a;
	Button knop;
	TextField tekstvak;
	Label label;

	public void init(){
		setSize(300, 400);
		setBackground(Color.white);
		tG = 1;
		
		//tekstvak initialiseren/in het geheugen laden
		label = new Label("tafel van:");
		tekstvak = new TextField("", 6);
		knop = new Button("Bereken");
		
		//knop linken aan ActionListener
		KnopListener kl = new KnopListener();
		knop.addActionListener( kl );
		//tekstvak.addActionListener(kl);
		        
        //instanties van deze objecten toe voegen aan de applet! 
        //Enter the Matrix
        add(label);
        add(tekstvak);
        add(knop);		
		
		
	}
		
	public void paint(Graphics g){
		int x = 100;
		int y = 70;
		//Dit is tafel van tG
		
				
		/*
		 * variabele: targetGetal, incremented number, antwoord 
		 * 
		 * incr>1 x tg[1] = 1
		 * 		2 x [1] = 2
		 * 		3 x [1] = 3
		 *  	
		 */
		
		//titel van de applet
		g.drawString("dit is de tafel van " + String.valueOf(tG)  , x, y);
		
		
		for(int i = 1; i < 11; i++){
			g.drawString(String.valueOf(i) + " x " + String.valueOf(tG) + " = " + i * tG, x, y+=15);
		}
			
	}
	
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			/*
			 * schermtekst = "ja, ik kom uit een inwendige klasse!";
			 * voteCount -= 10;
			 * b = b + 10;
			 */
			iTG = tekstvak.getText();
			tG = Integer.parseInt(iTG);
			
			//refesh the screen, making the change visible
			repaint();
		}
	}
}
