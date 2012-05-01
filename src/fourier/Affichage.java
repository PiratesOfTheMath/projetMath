package fourier;

import java.awt.*;

import javax.swing.*;

public class Affichage {

	
	private JFrame fenetre = new JFrame("Projet Math");
	private JPanel container = new JPanel();
	private JLabel affichage = new JLabel("test");
	private JTextField champA = new JTextField(0); 
    private JTextField champB = new JTextField(0); 
	
	
	public Affichage() { 
		
		
        fenetre.setSize(1024,500);
        fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        
        JPanel top = new JPanel();
        
        champA.setPreferredSize(new Dimension(50, 30));
        champB.setPreferredSize(new Dimension(50, 30));
        
        top.add(affichage);
        top.add(champA);
        top.add(champB);
        
        container.add(top, BorderLayout.NORTH);
        fenetre.setContentPane(container);
        fenetre.setVisible(true);
    }
}
