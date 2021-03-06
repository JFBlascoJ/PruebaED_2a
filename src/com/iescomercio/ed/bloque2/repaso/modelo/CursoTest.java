package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {	
	

	@Test
	void testEliminarAlumno() {
		Curso c = new Curso();
		int numAlumAntes;
		c.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Ant?nez"));
		numAlumAntes = c.numeroAlumnos();
		
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
		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));
		assertEquals(numAluAntes + 1, c.numeroAlumnos());
		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Ant?nez"));
		assertEquals(numAluAntes + 2, c.numeroAlumnos());

		
	}

	@Test
	void testEstaRegistrado() {
		Curso c = new Curso();
		
		c.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Ant?nez"));
		
		assertTrue(c.estaRegistrado("12345678B"));
		assertTrue(c.estaRegistrado("15687456J"));
		assertFalse(c.estaRegistrado("16600118Y"));
		
	}

	@Test
	void testCurso() {
		Curso c1 = new Curso(), c2 = new Curso();
		
		assertEquals(0, c1.numeroAlumnos() - c2.numeroAlumnos());
		c1.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c2.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));
		assertTrue(c1.numeroAlumnos() == c2.numeroAlumnos());
		
	}

	@Test
	void testNumeroAlumnos() {
		Curso c1 = new Curso(), c2 = new Curso();
		
		c1.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c1.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));		
		c1.aniadirAlumno(new Persona("63214895O", "Luis", "Ant?nez"));
		
		c2.aniadirAlumno(new Persona("12345678B", "Pepe", "Lopez"));		
		c2.aniadirAlumno(new Persona("15687456J", "Andrea", "Garc?a"));
		
		assertEquals(3, c1.numeroAlumnos());
		assertEquals(2, c2.numeroAlumnos());
		assertEquals(1, c1.numeroAlumnos() - c2.numeroAlumnos());
		
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
