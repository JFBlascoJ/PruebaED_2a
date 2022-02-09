package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {	
	

	@Test
	void testEliminarAlumno() {
		Curso c = new Curso();
		int numAlumAntes;
		c.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "García"));		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Antúnez"));
		numAlumAntes = c.numeroAlumnos();		;
		
		try {
			c.eliminarAlumno("12345678B");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(numAlumAntes - 1, c.numeroAlumnos());		
		
		assertThrows(Exception.class, ()-> c.eliminarAlumno("1357B"));
		try {
			c.eliminarAlumno("63214895O");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(numAlumAntes - 2, c.numeroAlumnos());
		
		
	}

	@Test
	void testAniadirAlumno() {
		Curso c = new Curso();
		int numAluAntes;
		
		c.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));
		
		numAluAntes = c.numeroAlumnos();
		
		assertEquals(numAluAntes,  c.numeroAlumnos());
		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "García"));
		assertEquals(numAluAntes + 1, c.numeroAlumnos());
		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Antúnez"));
		assertEquals(numAluAntes + 2, c.numeroAlumnos());

		
	}

	@Test
	void testEstaRegistrado() {
		Curso c = new Curso();
		
		c.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "García"));		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Antúnez"));
		
		assertTrue(c.estaRegistrado("12345678B"));
		assertTrue(c.estaRegistrado("15687456J"));
		assertFalse(c.estaRegistrado("16600118Y"));
		
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
