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
		Persona p2 = new Persona("15687456J", "Andrea", "García");		
		Persona p3 = new Persona("63214895O", "Luis", "Antúnez");
		
		assertEquals("12345678B",p1.getDni());
		assertEquals("García",p2.getApellido1());
		assertEquals("Luis",p3.getNombre());
	}

	@Test
	void testGetDni() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "García");		
		Persona p3 = new Persona("63214895O", "Luis", "Antúnez");
		
		assertEquals("12345678B",p1.getDni());
		assertEquals("15687456J",p2.getDni());
		assertEquals("63214895O",p3.getDni());
	}

	@Test
	void testSetDni() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "García");
		
		try {
			p1.setDni("25647831P");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertThrows(Exception.class, ()-> p1.setDni("1564785"));
		
		try {
			p2.setDni("35268547J");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	void testGetNombre() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "García");		
		Persona p3 = new Persona("63214895O", "Luis", "Antúnez");
		
		assertEquals("Pepe",p1.getNombre());
		assertEquals("Andrea",p2.getNombre());
		assertEquals("Luis",p3.getNombre());
	}

	@Test
	void testSetNombre() {
		Persona p1 = new Persona("12345678B", "Pepe", "Lopez");		
		Persona p2 = new Persona("15687456J", "Andrea", "García");
		
		p1.setNombre("Rigoberto");
		p2.setNombre("Irene");
		
		assertEquals("Rigoberto", p1.getNombre());
		assertEquals("Irene", p2.getNombre());
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
