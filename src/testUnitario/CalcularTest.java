package testUnitario;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import classesParaTeste.Calcular;


public class CalcularTest {
	
	private Calcular calculate = new Calcular();
	
	@Test
	public void mustSumTwoIntegerNumber() {
		int expected = 4;
		assertEquals(expected, calculate.sum(2, 2));
	}	
	
	@Test(expected= IllegalArgumentException.class)
	public void mustThrowsExceptionWhenSumNegativeNumber(){
		 calculate.sum(-2, 2);		
	}
		
	@Test
	public void mustSubtractTwoIntegerNumber(){
		int expected = 5;
		assertEquals(expected, calculate.subtract(10, 5));				
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void mustThrowsExceptionWhenSubtractNegativeNumber(){
		 calculate.subtract(7, -2);		
	}

		
	@Test
	public void calculateMultiple_3(){
		assertTrue(calculate.calculateMultiple(12));
	}
	
	@Test
	public void calculateMultiple3FalseCondion(){
		assertFalse(calculate.calculateMultiple(10));
		
	}					
}
