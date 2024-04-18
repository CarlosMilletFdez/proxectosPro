package PruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		//fail("Not yet implemented");
		Calculadora calcu=new Calculadora(20,10);
		float esperado = 30;
		float resul = calcu.sumar();
		
		assertEquals(esperado, resul);
	}

	@Test
	void testRestar() {
		//fail("Not yet implemented");
		Calculadora calcu=new Calculadora(20,10);
		float esperado = 10;
		float resul = calcu.restar();
		
		assertEquals(esperado, resul);
	}

	@Test
	void testMultiplicar() {
		//fail("Not yet implemented");
		Calculadora calcu=new Calculadora(20,10);
		float esperado = 200;
		float resul = calcu.multiplicar();
		
		assertEquals(esperado, resul);
	}

	@Test
	void testDividir() {
		//fail("Not yet implemented");
		Calculadora calcu=new Calculadora(20,10);
		float esperado = 2;
		float resul = calcu.dividir();
		
		assertEquals(esperado, resul);
	}

}
