package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Constructor para crear una nueva persona pasando todos los atributos como
	 * parámetro
	 * 
	 * @param dni       DNI de la persona
	 * @param nombre    Nombre de la persona
	 * @param apellido1 Apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Obtiene el DNI de la persona
	 * 
	 * @return Cadena con el DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Cambia el DNI de la persona en cuestión
	 * 
	 * @param dni Nuevo DNI
	 * @throws Exception si el último carácter del nuevo DNI no es una letra
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Obtiene el nombre de la persona en cuestión
	 * 
	 * @return Cadea con el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre de la persona
	 * 
	 * @param nombre Nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el apellido de la persona en cuestión
	 * 
	 * @return Cadena con el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Cambia el apellido de la persona
	 * 
	 * @param apellido1 Nuevo apellido
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
