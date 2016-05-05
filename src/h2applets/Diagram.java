package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//Deepin 2015.1.1
public class Diagram extends Applet {
	Button bKnop;
	Button hKnop;
	
	String schermtekst;
	String schermtekst2;
	TextField tekstvak;
	Label label;
	int bVote = 300;
	int hVote = 300;
	int b = 5;
	int h = 5;
	
	public void init() {
		//grote(x, y) van de applet window bepalen
		//configure the size of the applet window
		setSize(410, 400);
		
		//string object initialiseren
		schermtekst = "Choose the next president of the United states of America";
		schermtekst2 = "";
		
		//ruimte voor objecten laden in het geheugen
		label = new Label("label!");
		tekstvak = new TextField("naam", 6);
		bKnop = new Button("Vote for Bernie!");
		hKnop = new Button("Vote for Hillary!");		
		
		//Bernie knop linken aan ActionListener
		bKnopListener bkl = new bKnopListener();
        bKnop.addActionListener( bkl );
        
        
		//Clinton knop linken aan ActionListener
        hKnopListener hkl = new hKnopListener();
        hKnop.addActionListener( hkl );
                
        
        //instanties van deze objecten toe voegen aan de applet! 
        //Enter the Matrix
        //add(label);
        //add(tekstvak);
        add(hKnop);
        add(bKnop);
        
	}
	
	public void paint(Graphics g){
		int x = 10;
		int y = 0;
		//Voting Applet for the US elecetion 2016!
		
		//positie van de buttons bepalen
		this.hKnop.setLocation(x, y);
		this.bKnop.setLocation(x+120, y);
		
		//behind the scenes changes van variable zichtbaar maken
		y+=55;
		g.drawString("[ " + String.valueOf(hVote) + " ]", x+170, y);
				
		g.drawString("[ " + String.valueOf(bVote) + " ]", x+220, y);
		
		y+=45;
		
		g.drawLine(x, y, x+400, 100);
		
		x=10;
		g.drawString(schermtekst, x, 70);
		y+=15;
		g.drawString(schermtekst2, x, 85);
		
		
		
		//kandidaat 1
		y+=210;
		setBackground(Color.white);
		g.setColor(Color.blue);
		g.fillRect(x, hVote, 60, h);
		g.drawString("Hillary Clinton", 5, y);
		//kandidaat 2
		x+=100;
		g.setColor(Color.red);
		g.fillRect(x, bVote, 60, b);
		g.drawString("Bernie Sanders", 105, y);
		g.setColor(Color.black);
					
	}
	
	class bKnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){


			if(bVote > 100 && hVote > 100){
				schermtekst = "You have voted for Bernie Sanders!";
				schermtekst2 = "Thank you for voting fName + lName!";
				bVote -= 10;
				b = b + 10;
				//refesh the screen, making the change visible
			} else{
				if(bVote == 100){
					schermtekst = "Voting has closed, Bernie Sanders won, please exit the booth.";
				} else{
					schermtekst = "Voting has closed, you lost, Clinton won, please exit the booth.";
					schermtekst2 = "";
				}			
			}
			repaint();
		}
	}
	
	class hKnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){


			if(hVote > 100 && bVote > 100){
				schermtekst = "You have voted for Hillary Clinton!";
				schermtekst2 = "Thank you for voting fName + lName!";
				hVote -= 10;
				h = h + 10;
				//refesh the screen, making the change visible
			} else{
				if(hVote == 100){
					schermtekst = "Voting has closed, Hillary Clinton won, please exit the booth.";
				} else if(bVote == 100){
					schermtekst = "Voting has closed, you lost!, Bernie won, please exit the booth.";
					schermtekst2 = "";
				}
			}
			repaint();
		}
	}
	
	
	

}
