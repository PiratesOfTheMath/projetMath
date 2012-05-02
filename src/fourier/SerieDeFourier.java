package fourier;

public class SerieDeFourier {
	
	private Spectre spectre;
	
	public SerieDeFourier(Spectre _spectre){
		this.spectre = _spectre;
	}
	
	
	public double getValeur(double t){
		double sf = 0;
		for(int i = 0; i < spectre.getlength(); i++)
			sf += spectre.getFrequence(i) * Math.cos(2*Math.PI * Math.pow(2, i+5) * t);
		
		return sf;
	}
	
	public Spectre getSpectre(){
		return this.spectre;
	}
}
