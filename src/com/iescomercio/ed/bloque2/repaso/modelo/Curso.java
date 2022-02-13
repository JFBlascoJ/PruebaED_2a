package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Elimina del curso a la persona con el DNI indicado por usuario
	 * 
	 * @param dni DNI de la persona a borrar
	 * @throws Exception cuando el DNI no tiene la longitud adecuada
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * A�ade una nueva persona al curso
	 * 
	 * @param p Persona a a�adir
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Comprueba si el DNI pasado por par�metro existe dentro del curso en cuesti�n
	 * 
	 * @param dni DNI a comprobar
	 * @return True si existe. En caso contratio, retornar� false
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Crea un nuevo curso vac�o
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Comprueba cu�ntos alumnos tiene el curso
	 * 
	 * @return N�mero de alumnos del curso
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
