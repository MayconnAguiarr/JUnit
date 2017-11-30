package testUnitario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import classes.Calcular;


public class CalcularTest {
	
	private Calcular calculate = new Calcular();
	
	@Test
	public void must_Sum_Two_Integer_number() {
		int expected = 4;
		assertEquals(expected, calculate.sum(2, 2));
	}	
	
	@Test(expected= IllegalArgumentException.class)
	public void must_throws_Exception_When_Sum_Negative_Number(){
		 calculate.sum(-2, 2);		
	}
		
	@Test
	public void must_subtract_two_integer_number(){
		int expected = 5;
		assertEquals(expected, calculate.subtract(10, 5));				
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void must_throws_exception_when_subtract_negative_number(){
		 calculate.subtract(7, -2);		
	}

		
	@Test
	public void calculate_multiple_3(){
		assertTrue(calculate.calculateMultiple(12));
	}
	
	@Test
	public void calculate_multiple_3_false_condion(){
		assertFalse(calculate.calculateMultiple(10));
		
	}
					
}
