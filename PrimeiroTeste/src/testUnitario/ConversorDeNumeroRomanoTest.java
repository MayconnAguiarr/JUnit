package testUnitario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.ConversorDeNumeroRomano;


public class ConversorDeNumeroRomanoTest {

	ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

	@Test
	public void deveEntenderOSimboloI() {
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}

	@Test
	public void deveEntenderOSimboloV() {
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}

	@Test
	public void deveEntenderDoisSimbolosComoII() {
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}

	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}

	@Test
	public void deveEntenderNumerosComoIX() {	
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {	
		int numero = romano.converte("XXIV");
		assertEquals(24, numero);
	}

}
