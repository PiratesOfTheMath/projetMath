package fourier;

public class Spectre {

	private int[] amplitude;
	
	public Spectre(){
		amplitude = new int[9];
		initialisationFrequence();
	}
	
	public void setFrequence(int i, int j) {
		amplitude[i]=j;
	}

	public int getAmplitude(int i) {
		
		return amplitude[i];
	}

	public void initialisationFrequence() {
		for(int i = 0; i < amplitude.length; i++)
			amplitude[i] = 0;
		
	}

	public int getlength() {
		return amplitude.length;
	}

}
