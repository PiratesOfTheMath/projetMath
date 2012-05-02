package fourier;

public class SerieDeFourier {
	
	private Spectre spectre;
	
	public SerieDeFourier(){
		this.spectre = new Spectre();
	}
	
	
	public double getValeur(double t){
		double sf = 0;
		for(int j = 0; j < spectre.getlength(); j++)
			sf += spectre.getAmplitude(j) * Math.cos(2*Math.PI * Math.pow(2, j+5) * t);
		
		sf = sf / this.spectre.getlength();
		
		return sf;
	}
	
	public Spectre getSpectre(){
		return this.spectre;
	}
}
