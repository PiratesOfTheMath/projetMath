package fourier;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class SynGen {
	ByteBuffer byteBuffer;
	ShortBuffer shortBuffer;
	int byteLength;
	
	void getSyntheticData(byte[] synDataBuffer, SerieDeFourier serie){

	    byteBuffer = ByteBuffer.wrap(synDataBuffer);
	    shortBuffer = byteBuffer.asShortBuffer();

	    byteLength = synDataBuffer.length;
	    
	    tones(serie);
	}
	
	void tones(SerieDeFourier serie){
		int channel = 1;
		int bytesPerSamp = 2;
	    double sampleRate = 16000.0F;
	    // Allowable 8000,11025,16000,22050,44100
	    int sampLength = byteLength / bytesPerSamp;
	    
	    for(int cnt = 0; cnt < sampLength; cnt++){
	        double time = cnt/sampleRate;
	        double freq = 950.0;//arbitrary frequency
	        double sinValue = serie.getValeur(time);
	        		
	        shortBuffer.put((short)(16000*sinValue));
	      }//end for loop
	}
}
