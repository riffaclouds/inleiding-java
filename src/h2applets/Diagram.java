package h2applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Diagram extends Applet {
	Button bKnop;
	Button hKnop;
	
	String schermtekst;
	String schermtekst2;
	TextField tekstvak;
	Label label;
	int bVote = 200;
	int hVote = 200;
	int b = 100;
	int h = 100;
	
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
		
		g.drawString(String.valueOf(hVote), x+170, y+65);
				
		g.drawString(String.valueOf(bVote), x+200, 65);
		
		
		//kandidaat 1
		setBackground(Color.white);
		g.setColor(Color.blue);
		g.fillRect(x, hVote, 60, h);
		g.drawString("Hillary Clinton", 5, 315);
		//kandidaat 2
		x+=100;
		g.setColor(Color.red);
		g.fillRect(x, bVote, 60, b);
		g.drawString("Bernie Sanders", 105, 315);
		g.setColor(Color.black);
		
		x=10;
		y+=80;
		g.drawString(schermtekst, x, y);
		y+=15;
		g.drawString(schermtekst2, x, y);
		g.drawLine(x-10, y+5, x+400, y+5);
		
		
		
		
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
					schermtekst = "Voting has closed, Clinton won, please exit the booth.";
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
					schermtekst = "Voting has closed, Bernie won, please exit the booth.";
				}
			}


			repaint();
		}
	}
	
	
	

}
