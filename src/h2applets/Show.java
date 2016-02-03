package h2applets;

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;



//een klasse met de naam Show van het type Applet
public class Show extends Applet {

	  //een (lege) methode die de Applet initialiseert
	  public void init() {
		  
		  
	  }
	  //een methode die de inhoud van het scherm tekent
	  public void paint(Graphics g) {
		  	setBackground(Color.white); 
		    g.setColor(Color.black);
		    g.drawRect(19, 19, 51, 11);
		    g.setColor(Color.yellow);
		    g.fillRect(20, 20, 10, 10);
		    g.setColor(Color.red);
		    g.fillRect(30, 20, 10, 10);
		    g.setColor(Color.green);
		    g.fillRect(40, 20, 10, 10);
		    g.setColor(Color.magenta);
		    g.fillRect(50, 20, 10, 10);
		    g.setColor(Color.yellow);
		    g.fillRect(60, 20, 10, 10);
		    g.setColor(Color.black);
		    
		    g.drawOval(20, 40, 50, 50);
	  }

	}