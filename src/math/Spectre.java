package math;

public class Spectre {

	private int[] amplitude;
	
	public Spectre(){
		amplitude = new int[8];
	}
	
	public void setFrequence(int i, int j) {
		amplitude[i]=j;
	}

	public int getFrequence(int i) {
		
		return amplitude[i];
	}

}
