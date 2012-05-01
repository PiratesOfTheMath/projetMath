package fourier;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Affichage extends Frame implements ActionListener{

	
	private JFrame fenetre = new JFrame("Projet Math");
	
	private JButton bouton = new JButton("Travail"); 
	
	private JPanel container = new JPanel(new BorderLayout());
	private JPanel container2 = new JPanel(new BorderLayout());
	private JPanel container3 = new JPanel(new BorderLayout());
	private JPanel container4 = new JPanel(new BorderLayout());
	private JPanel container5 = new JPanel(new BorderLayout());
	
	private JLabel collone1 = new JLabel("             ");
	private JLabel collone2 = new JLabel("32");
	private JLabel collone3 = new JLabel("64");
	private JLabel collone4 = new JLabel("128");
	private JLabel collone5 = new JLabel("256");
	private JLabel collone6 = new JLabel("512");
	private JLabel collone7 = new JLabel("1024");
	private JLabel collone8 = new JLabel("2048");
	private JLabel collone9 = new JLabel("4096");
	private JLabel collone10 = new JLabel("8192");
	
	
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
	
    public void actionPerformed(ActionEvent e) { 
        //APPELER FONCTION QUI FAIT LE SON !!
    	
    }
    
    
	public Affichage() { 
		
		bouton.addActionListener(this);
		
        fenetre.setSize(1024,500);
        fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		JPanel top = new JPanel();
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        JPanel top3 = new JPanel();
        JPanel top4 = new JPanel();
        JPanel east = new JPanel();
        
        collone2.setPreferredSize(new Dimension(50, 30));
        collone3.setPreferredSize(new Dimension(50, 30));
        collone4.setPreferredSize(new Dimension(50, 30));
        collone5.setPreferredSize(new Dimension(50, 30));
        collone6.setPreferredSize(new Dimension(50, 30));
        collone7.setPreferredSize(new Dimension(50, 30));
        collone8.setPreferredSize(new Dimension(50, 30));
        collone9.setPreferredSize(new Dimension(50, 30));
        
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
        
        top.add(collone1);
        top.add(collone2);
        top.add(collone3);
        top.add(collone4);
        top.add(collone5);
        top.add(collone6);
        top.add(collone7);
        top.add(collone8);
        top.add(collone9);
        top.add(collone10);
        
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
        
        east.add(bouton);
        
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
        
        
        container5.add(top4, BorderLayout.NORTH);
        container4.add(container5);
        container4.add(top3, BorderLayout.NORTH);
        container3.add(container4);
        container3.add(top2, BorderLayout.NORTH);
        container2.add(container3);
        container2.add(top1, BorderLayout.NORTH);
        container.add(container2);
        container.add(top, BorderLayout.NORTH);
        container5.add(east, BorderLayout.EAST);
        
        fenetre.setContentPane(container);
        fenetre.setVisible(true);
    }
	
	public String contenuChamp1A() { 
        return champ1A.getText(); 
    } 

    public String contenuChamp1B() { 
        return champ1B.getText(); 
    } 
    
    public String contenuChamp1C() { 
        return champ1C.getText(); 
    } 

    public String contenuChamp1D() { 
        return champ1D.getText(); 
    } 
    
    public String contenuChamp1E() { 
        return champ1E.getText(); 
    } 

    public String contenuChamp1F() { 
        return champ1F.getText(); 
    } 
    
    public String contenuChamp1G() { 
        return champ1G.getText(); 
    } 

    public String contenuChamp1H() { 
        return champ1H.getText(); 
    } 
    
    public String contenuChamp1I() { 
        return champ1I.getText(); 
    } 

    public String contenuChamp2A() { 
        return champ2A.getText(); 
    } 
    
    public String contenuChamp2B() { 
        return champ2B.getText(); 
    } 
    
    public String contenuChamp2C() { 
        return champ2C.getText(); 
    } 

    public String contenuChamp2D() { 
        return champ2D.getText(); 
    } 
    
    public String contenuChamp2E() { 
        return champ2E.getText(); 
    } 

    public String contenuChamp2F() { 
        return champ2F.getText(); 
    } 
    
    public String contenuChamp2G() { 
        return champ2G.getText(); 
    } 

    public String contenuChamp2H() { 
        return champ2H.getText(); 
    } 
    
    public String contenuChamp2I() { 
        return champ2I.getText(); 
    }
    
    public String contenuChamp3A() { 
        return champ3A.getText(); 
    } 
    
    public String contenuChamp3B() { 
        return champ3B.getText(); 
    } 
    
    public String contenuChamp3C() { 
        return champ3C.getText(); 
    } 

    public String contenuChamp3D() { 
        return champ3D.getText(); 
    } 
    
    public String contenuChamp3E() { 
        return champ3E.getText(); 
    } 

    public String contenuChamp3F() { 
        return champ3F.getText(); 
    } 
    
    public String contenuChamp3G() { 
        return champ3G.getText(); 
    } 

    public String contenuChamp3H() { 
        return champ3H.getText(); 
    } 
    
    public String contenuChamp3I() { 
        return champ3I.getText(); 
    }
    
    public String contenuChamp4A() { 
        return champ4A.getText(); 
    } 
    
    public String contenuChamp4B() { 
        return champ4B.getText(); 
    } 
    
    public String contenuChamp4C() { 
        return champ4C.getText(); 
    } 

    public String contenuChamp4D() { 
        return champ4D.getText(); 
    } 
    
    public String contenuChamp4E() { 
        return champ4E.getText(); 
    } 

    public String contenuChamp4F() { 
        return champ4F.getText(); 
    } 
    
    public String contenuChamp4G() { 
        return champ4G.getText(); 
    } 

    public String contenuChamp4H() { 
        return champ4H.getText(); 
    } 
    
    public String contenuChamp4I() { 
        return champ4I.getText(); 
    }
}
