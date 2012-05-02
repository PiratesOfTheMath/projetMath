package fourier;

public class main {
	
	private static Affichage affichage; 
    
    public static void main(String[] args) { 
    	
    	Affichage affichage = new Affichage(); 
        Spectre spectre = new Spectre();
    	SerieDeFourier Fourier = new SerieDeFourier(spectre);
    	affichage.setSerieDeFourier(Fourier);
    	
    	
    
    } 
}
