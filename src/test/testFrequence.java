package test;

import static org.junit.Assert.*;


import org.junit.Test;

import fourier.SerieDeFourier;
import fourier.Spectre;

public class testFrequence {

	Spectre spectre = new Spectre();
	SerieDeFourier sf = new SerieDeFourier();
	
	@Test
	public void testAmplitudePourUneFrequence(){
		
		spectre.setFrequence(1, 52);
		assertEquals(spectre.getAmplitude(1), 52);
	}
	
	@Test
	public void testAmplitudePourUneAutreFrequence(){
		spectre.initialisationFrequence();
		
		assertEquals(spectre.getAmplitude(7), 0);
	}

	@Test
	public void testTailleSpectre(){
		spectre.initialisationFrequence();
		
		assertEquals(spectre.getlength(), 8);
	}
}
