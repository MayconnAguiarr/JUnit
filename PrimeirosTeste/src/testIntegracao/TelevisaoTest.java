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
	public void testProximoCanal() throws Exception{
		tv.ligar();
		tv.proximoCanal();
		int expected = 2;		
		assertEquals(expected, tv.getCanal());		
	}
		
	@Test(expected = Exception.class)
	public void testExceptionAtingidoMaiorCanal10() throws Exception{
		tv.ligar();
		tv.setCanal(10);
		tv.proximoCanal();
		int expected = 10;
		assertEquals(expected, tv.getCanal());				
	}
	
	@Test
	public void testCanalAnterior() throws Exception{
		tv.ligar();
		tv.setCanal(5);
		tv.canalAnterior();
		int expected = 4;
		assertEquals(expected, tv.getCanal());				
	}
	
	@Test(expected = Exception.class)
	public void testExceptionAtingidoMenorCanal_1() throws Exception{
		tv.ligar();
		tv.setCanal(1);
		tv.canalAnterior();
		int expected = 1;
		assertEquals(expected, tv.getCanal());		
	}
	
	@Test
	public void testAumentarVolume() throws Exception{
		tv.ligar();
		tv.aumentarVolume();
		int expected = 1;
		assertEquals(expected, tv.getVolume());		
	}
	
	@Test(expected = Exception.class)
	public void testExceptionVolumeMaximoAtingido_50() throws Exception{
		tv.ligar();
		tv.setVolume(50);
		tv.aumentarVolume();
		int expected = 50;
		assertEquals(expected, tv.getVolume());
	}
	
	@Test
	public void testDiminuirVolume() throws Exception{
		tv.ligar();
		tv.setVolume(5);
		tv.diminuirVolume();
		int expected = 4;
		assertEquals(expected, tv.getVolume());				
	}
	
	@Test(expected = Exception.class)
	public void testEceptionAtingidoVolumeMinimo_0() throws Exception{
		tv.ligar();
		tv.diminuirVolume();
		int expected = 0;
		assertEquals(expected, tv.getVolume());		
	}
	
}
