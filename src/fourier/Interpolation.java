package fourier;

public class Interpolation {
	
	private int borneInf = -5;
	private int borneSup = 5;
	
	private double[] xi;
	private double[][] fNewton;
	
	private double[][] amplitude;
	private SerieDeFourier[] serie;
	
	public Interpolation(SerieDeFourier[] serie){
		this.serie = serie;
		
		amplitude = new double[4][9];
		
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 9; i++){
				amplitude[j][i] = serie[j].getSpectre().getAmplitude(i);
			}
		}
	}
	
	public double getAmplitude(double t, int i){
		polynomeNewton(4, i);
		
		double ampl = getOrdonneePolyNe(t);
		
		return ampl;
	}
	
	public double getValeur(double t, int stade){
		double sf = 0;
		
		Spectre spectre = serie[stade].getSpectre();
		
		for(int j = 0; j < spectre.getlength(); j++)
			sf += getAmplitude(t, j) * Math.cos(2*Math.PI * Math.pow(2, j+5) * t);
		
		sf = sf / spectre.getlength();		
		return sf;
	}
	
	public int getBorneInf() {
		return borneInf;
	}

	public int getBorneSup() {
		return borneSup;
	}
	
	public void setBorneInf(int borne){
		borneInf = borne;
	}
	
	public void setBorneSup(int borne){
		borneSup = borne;
	}
	
	public double getOrdonnee(int i, int j) {
		return amplitude[i][j];
	}
	
	//fonction qui créer le polynome d'interpolation avec les points équidistants
	public void polynomeNewton(int nbPoint, int i){
		fNewton = new double[nbPoint][nbPoint];
		xi = abscisseFonctionF(nbPoint);
		
		initialisationOrdonnee(nbPoint, xi, i);
		
		constructionCoordonnee(nbPoint, xi);
	}
	
	
	//initialise la première colonne de la matrice
	public void initialisationOrdonnee(int nbPoint, double[] abscisse, int freq) {
		for(int i = 0; i < nbPoint; i++)
		{
			fNewton[i][0] = getOrdonnee(i, freq);
		}		
	}
	
	//construit la matrice pour récupérer les coeficients du polynome
	private void constructionCoordonnee(int nbPoint, double[] xi) {
		for(int i = 1; i < nbPoint; i++){
			for(int j = 1; j <= i; j++){
				fNewton[i][j]= (fNewton[i][j-1] - fNewton[i-1][j-1])/(xi[i] - xi[i-j]);
			}
		}
	}
	
	//retourne les abscisses equidistantes en fonction du nombre de point
	public double[] abscisseFonctionF(int nbPoint) {
		double abscisse[] = new double[nbPoint];
		double increment = 16000;
		
		abscisse[0] = 0;
		
		for(int i = 1; i < nbPoint; i++)
		{
			abscisse[i] = abscisse[i - 1] + increment;
		}
		
		return abscisse;
	}
	
	public double getOrdonneePolyNe(double abs) {
		double ordonnee = fNewton[0][0];
		double temp;
		for(int i = 1; i < fNewton.length; i++){
			
			int j = 0;
			temp = fNewton[i][i];
			while(j != i)
			{
				temp = temp * (abs - xi[j]);
				j++;
			}
			ordonnee += temp;
		}
		return ordonnee;
	}
}
