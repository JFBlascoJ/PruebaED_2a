package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testPersona() {
		fail("Not yet implemented");
	}

	@Test
	void testPersonaStringStringString() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "Garc�a");		
		Persona p3 = new Persona("63214895O", "Luis", "Ant�nez");
		
		assertEquals("12345678B",p1.getDni());
		assertEquals("Garc�a",p2.getApellido1());
		assertEquals("Luis",p3.getNombre());
	}

	@Test
	void testGetDni() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "Garc�a");		
		Persona p3 = new Persona("63214895O", "Luis", "Ant�nez");
		
		assertEquals("12345678B",p1.getDni());
		assertEquals("15687456J",p2.getDni());
		assertEquals("63214895O",p3.getDni());
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
