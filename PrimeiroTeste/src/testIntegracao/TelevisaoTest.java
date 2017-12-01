package testIntegracao;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import classesParaTeste.Televisao;


public class TelevisaoTest {
	
	Televisao tv = new Televisao();
	
	@Test
	public void testLigarTelevisao(){
		tv.ligar();
		assertTrue(tv.getEstaLigada());					
	}
	
	@Test
	public void testDesligarTelevisao(){
		tv.ligar();
		tv.desligar();
		assertFalse(tv.getEstaLigada());		
	}
	
	@Test
	public void testAdicionaCanal() throws Exception{
		tv.ligar();
		tv.addCanal();
		int expected = 2;		
		assertEquals(expected, tv.getCanal());		
	}
	
	
	@Test(expected = Exception.class)
	public void testExceptionLimiteDeCanais() throws Exception{
		tv.ligar();
		tv.setCanal(10);
		tv.addCanal();
		int expected = 10;
		assertEquals(expected, tv.getCanal());				
	}
	
	@Test
	public void testSubtraiCanal() throws Exception{
		tv.ligar();
		tv.setCanal(5);
		tv.subCanal();
		int expected = 4;
		assertEquals(expected, tv.getCanal());				
	}
	
}
