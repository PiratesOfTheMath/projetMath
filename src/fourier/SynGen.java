package fourier;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class SynGen {
	public ByteBuffer byteBuffer;
	public ShortBuffer shortBuffer;
	public int byteLength;
	
	public int nbSerie;
	
	void getSyntheticData(byte[] synDataBuffer, SerieDeFourier[] serie){

	    byteBuffer = ByteBuffer.wrap(synDataBuffer);
	    shortBuffer = byteBuffer.asShortBuffer();

	    byteLength = synDataBuffer.length;
	    nbSerie = serie.length;
	    
	    tones(serie);
	}
	
	void tones(SerieDeFourier[] serie){
		int channel = 1;
		int bytesPerSamp = 2;
	    double sampleRate = 16000.0F;
	    // Allowable 8000,11025,16000,22050,44100
	    int sampLength = byteLength / bytesPerSamp;
	    int i = 0;
	    
	    for(int cnt = 0; cnt < sampLength; cnt++){
	        double time = cnt/sampleRate;
	        
	        double sinValue = serie[i].getValeur(time);
	        
	        shortBuffer.put((short)(8000*sinValue));
	        
	        if(cnt >= (i+1)*(sampLength/(nbSerie)))
	        	i++;
	     }//end for loop
	}
	
	void getSyntheticDataInterpolation(byte[] synDataBuffer, SerieDeFourier[] serie){

	    byteBuffer = ByteBuffer.wrap(synDataBuffer);
	    shortBuffer = byteBuffer.asShortBuffer();

	    byteLength = synDataBuffer.length;
	    nbSerie = serie.length;
	    
	    tonesInterpolation(serie);
	}
	
	void tonesInterpolation(SerieDeFourier[] serie){
		int channel = 1;
		int bytesPerSamp = 2;
	    double sampleRate = 16000.0F;
	    // Allowable 8000,11025,16000,22050,44100
	    int sampLength = byteLength / bytesPerSamp;
	    int i = 0;
	    
	    Interpolation inter = new Interpolation(serie);
	    
	    for(int cnt = 0; cnt < sampLength; cnt++){
	        double time = cnt/sampleRate;
	        
	        double sinValue = inter.getValeur(time, i);
	        
	        shortBuffer.put((short)(8000*sinValue));
	        
	        if(cnt >= (i+1)*(sampLength/(nbSerie)))
	        	i++;
	     }//end for loop
	}
}
