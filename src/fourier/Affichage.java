package fourier;

import javax.swing.*;

public class Affichage {

	private JFrame fenetre;
	private JLabel affichage; 
	
	public Affichage() { 
		
        this.fenetre = new JFrame("Projet Math"); 
        this.fenetre.setVisible(true); 
        this.affichage = new JLabel();
        
    }
}
