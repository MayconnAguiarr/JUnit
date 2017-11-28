package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.Calcular;

public class CalcularTeste {
	
	private Calcular calculadora;

	@Before
	public void inicia(){		
		calculadora = new Calcular();		
	}

	@Test
	public void testeSomaDoisInteiro() {
		assertEquals(4, calculadora.soma(2, 2));
	}	
		
	@Test
	public void testeSubtracaoDoisInteiro(){
		assertEquals(5	, calculadora.subtracao(10, 5));		
		
	}
		
	@Test
	public void testeCalcularMultiploDe3(){
		assertTrue(calculadora.calcularMultiplo(12));
	}
	
	@Test
	public void testeCalcularMultiploDe3CondicaoFalsa(){
		assertFalse(calculadora.calcularMultiplo(10));
		
	}
					
}
