package ejercicio1;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante> {
	private String nombre;
	private String dni;
	
	public Estudiante(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", dni=" + dni + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	}
	
}
