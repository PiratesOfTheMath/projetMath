package test;

import static org.junit.Assert.*;

import math.SerieDeFourier;
import math.Spectre;

import org.junit.Test;

public class testFrequence {

	Spectre spectre = new Spectre();
	SerieDeFourier sf = new SerieDeFourier();
	
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
	
	public void testSerieDeFourrier(){
		
	}
}
