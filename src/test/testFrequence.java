package test;

import static org.junit.Assert.*;


import org.junit.Test;

import fourier.SerieDeFourier;
import fourier.Spectre;

public class testFrequence {

	Spectre spectre = new Spectre();
	SerieDeFourier sf = new SerieDeFourier(spectre);
	
	@Test
	public void testAmplitudePourUneFrequence(){
		
		spectre.setFrequence(1, 52);
		assertEquals(spectre.getFrequence(1), 52);
	}
	
	@Test
	public void testAmplitudePourUneAutreFrequence(){
		spectre.initialisationFrequence();
		
		assertEquals(spectre.getFrequence(7), 0);
	}

	@Test
	public void testTailleSpectre(){
		spectre.initialisationFrequence();
		
		assertEquals(spectre.getlength(), 8);
	}
	
	@Test
	public void testSerieDeFourrier(){
		
	}
}
