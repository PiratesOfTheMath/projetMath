package test;

import static org.junit.Assert.*;

import math.Spectre;

import org.junit.Test;

public class testFrequence {

	@Test
	public void test() {
		Spectre spectre = new Spectre();
		
		spectre.setFrequence(1, 52);
		assertEquals(spectre.getFrequence(1), 52);
	}

}
