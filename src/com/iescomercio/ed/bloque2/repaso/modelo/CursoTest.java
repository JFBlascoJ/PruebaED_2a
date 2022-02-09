package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {	
	

	@Test
	void testEliminarAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadirAlumno() {
		Curso c = new Curso();
		int numAluAntes;
		
		c.aniadirAlumno(new Persona("123456789B", "Pepe", "Lopez"));
		
		numAluAntes = c.numeroAlumnos();
		
		assertEquals(numAluAntes,  c.numeroAlumnos());
		
		c.aniadirAlumno(new Persona("15687456J", "Andrea", "García"));
		assertEquals(numAluAntes + 1, c.numeroAlumnos());
		
		c.aniadirAlumno(new Persona("63214895O", "Luis", "Antúnez"));
		assertEquals(numAluAntes + 2, c.numeroAlumnos());

		
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
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
