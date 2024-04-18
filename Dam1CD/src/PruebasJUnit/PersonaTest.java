package PruebasJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testGetNombre() {
//		fail("Not yet implemented");
		Persona p1 = new Persona("Juan",23);
		assertEquals("Juan",p1.getNombre());
	}

	@Test
	void testSetNombre() {
		//fail("Not yet implemented");
		Persona p1 = new Persona("Juan",23);
		p1.setNombre("Diana");
		assertEquals("Diana",p1.getNombre());
	}

	@Test
	void testGetEdad() {
		//fail("Not yet implemented");
		Persona p1 = new Persona("Juan",23);
		assertEquals(23,p1.getEdad());
	}

	@Test
	void testSetEdad() {
		//fail("Not yet implemented");
		Persona p1 = new Persona("Juan",23);
		p1.setEdad(10);
		assertEquals(10,p1.getEdad());
	}

	@Test
	void testEsMayorDeEdad() {
		//fail("Not yet implemented");
		Persona pMayor = new Persona("Es mayor",50);
		Persona pMenor = new Persona("Es menor",5);
		assertTrue(pMayor.esMayorDeEdad(pMayor.getEdad()));
		assertFalse(pMenor.esMayorDeEdad(pMenor.getEdad()));
		
	}

}
