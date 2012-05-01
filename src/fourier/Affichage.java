package fourier;

import java.awt.*;

import javax.swing.*;

public class Affichage {

	
	private JFrame fenetre = new JFrame("Projet Math");
	private JPanel container = new JPanel(new BorderLayout());
	private JPanel container2 = new JPanel(new BorderLayout());
	private JPanel container3 = new JPanel(new BorderLayout());
	private JPanel container4 = new JPanel(new BorderLayout());
	
	private JLabel ligne1 = new JLabel("Ligne 1");
	
	private JTextField champ1A = new JTextField("0"); 
    private JTextField champ1B = new JTextField("0");
    private JTextField champ1C = new JTextField("0"); 
    private JTextField champ1D = new JTextField("0"); 
    private JTextField champ1E = new JTextField("0"); 
    private JTextField champ1F = new JTextField("0"); 
    private JTextField champ1G = new JTextField("0"); 
    private JTextField champ1H = new JTextField("0"); 
    private JTextField champ1I = new JTextField("0"); 
    
    private JLabel ligne2 = new JLabel("Ligne 2");
    
    private JTextField champ2A = new JTextField("0"); 
    private JTextField champ2B = new JTextField("0");
    private JTextField champ2C = new JTextField("0"); 
    private JTextField champ2D = new JTextField("0"); 
    private JTextField champ2E = new JTextField("0"); 
    private JTextField champ2F = new JTextField("0"); 
    private JTextField champ2G = new JTextField("0"); 
    private JTextField champ2H = new JTextField("0"); 
    private JTextField champ2I = new JTextField("0"); 
    
    private JLabel ligne3 = new JLabel("Ligne 3");
    
    private JTextField champ3A = new JTextField("0"); 
    private JTextField champ3B = new JTextField("0");
    private JTextField champ3C = new JTextField("0"); 
    private JTextField champ3D = new JTextField("0"); 
    private JTextField champ3E = new JTextField("0"); 
    private JTextField champ3F = new JTextField("0"); 
    private JTextField champ3G = new JTextField("0"); 
    private JTextField champ3H = new JTextField("0"); 
    private JTextField champ3I = new JTextField("0");
    
    private JLabel ligne4 = new JLabel("Ligne 4");
    
    private JTextField champ4A = new JTextField("0"); 
    private JTextField champ4B = new JTextField("0");
    private JTextField champ4C = new JTextField("0"); 
    private JTextField champ4D = new JTextField("0"); 
    private JTextField champ4E = new JTextField("0"); 
    private JTextField champ4F = new JTextField("0"); 
    private JTextField champ4G = new JTextField("0"); 
    private JTextField champ4H = new JTextField("0"); 
    private JTextField champ4I = new JTextField("0");
	
	
	public Affichage() { 
		
		
        fenetre.setSize(1024,500);
        fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        JPanel top3 = new JPanel();
        JPanel top4 = new JPanel();
        
        champ1A.setPreferredSize(new Dimension(50, 30));
        champ1B.setPreferredSize(new Dimension(50, 30));
        champ1C.setPreferredSize(new Dimension(50, 30));
        champ1D.setPreferredSize(new Dimension(50, 30));
        champ1E.setPreferredSize(new Dimension(50, 30));
        champ1F.setPreferredSize(new Dimension(50, 30));
        champ1G.setPreferredSize(new Dimension(50, 30));
        champ1H.setPreferredSize(new Dimension(50, 30));
        champ1I.setPreferredSize(new Dimension(50, 30));
        
        champ2A.setPreferredSize(new Dimension(50, 30));
        champ2B.setPreferredSize(new Dimension(50, 30));
        champ2C.setPreferredSize(new Dimension(50, 30));
        champ2D.setPreferredSize(new Dimension(50, 30));
        champ2E.setPreferredSize(new Dimension(50, 30));
        champ2F.setPreferredSize(new Dimension(50, 30));
        champ2G.setPreferredSize(new Dimension(50, 30));
        champ2H.setPreferredSize(new Dimension(50, 30));
        champ2I.setPreferredSize(new Dimension(50, 30));
        
        champ3A.setPreferredSize(new Dimension(50, 30));
        champ3B.setPreferredSize(new Dimension(50, 30));
        champ3C.setPreferredSize(new Dimension(50, 30));
        champ3D.setPreferredSize(new Dimension(50, 30));
        champ3E.setPreferredSize(new Dimension(50, 30));
        champ3F.setPreferredSize(new Dimension(50, 30));
        champ3G.setPreferredSize(new Dimension(50, 30));
        champ3H.setPreferredSize(new Dimension(50, 30));
        champ3I.setPreferredSize(new Dimension(50, 30));
        
        champ4A.setPreferredSize(new Dimension(50, 30));
        champ4B.setPreferredSize(new Dimension(50, 30));
        champ4C.setPreferredSize(new Dimension(50, 30));
        champ4D.setPreferredSize(new Dimension(50, 30));
        champ4E.setPreferredSize(new Dimension(50, 30));
        champ4F.setPreferredSize(new Dimension(50, 30));
        champ4G.setPreferredSize(new Dimension(50, 30));
        champ4H.setPreferredSize(new Dimension(50, 30));
        champ4I.setPreferredSize(new Dimension(50, 30));
        
        top1.add(ligne1);
        top1.add(champ1A);
        top1.add(champ1B);
        top1.add(champ1C);
        top1.add(champ1D);
        top1.add(champ1E);
        top1.add(champ1F);
        top1.add(champ1G);
        top1.add(champ1H);
        top1.add(champ1I);
        
        top2.add(ligne2);
        top2.add(champ2A);
        top2.add(champ2B);
        top2.add(champ2C);
        top2.add(champ2D);
        top2.add(champ2E);
        top2.add(champ2F);
        top2.add(champ2G);
        top2.add(champ2H);
        top2.add(champ2I);
       
        top3.add(ligne3);
        top3.add(champ3A);
        top3.add(champ3B);
        top3.add(champ3C);
        top3.add(champ3D);
        top3.add(champ3E);
        top3.add(champ3F);
        top3.add(champ3G);
        top3.add(champ3H);
        top3.add(champ3I);
        
        top4.add(ligne4);
        top4.add(champ4A);
        top4.add(champ4B);
        top4.add(champ4C);
        top4.add(champ4D);
        top4.add(champ4E);
        top4.add(champ4F);
        top4.add(champ4G);
        top4.add(champ4H);
        top4.add(champ4I);
        
        container4.add(top4, BorderLayout.NORTH);
        container3.add(container4);
        container3.add(top3, BorderLayout.NORTH);
        container2.add(container3);
        container2.add(top2, BorderLayout.NORTH);
        container.add(container2);
        container.add(top1, BorderLayout.NORTH);
        
        fenetre.setContentPane(container);
        //fenetre.setContentPane(top3);
        fenetre.setVisible(true);
    }
}
