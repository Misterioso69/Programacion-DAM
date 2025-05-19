package Ej3;

import java.util.Comparator;
import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
	private String dni;
	private String nombre;
	private int edad;
	private int num_goles;

	public Futbolista(String dni, String nombre, int edad, int num_goles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.num_goles = num_goles;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNum_goles() {
		return num_goles;
	}

	public void setNum_goles(int num_goles) {
		this.num_goles = num_goles;
	}

	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", num_goles=" + num_goles + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.dni);
	}


	public static Comparator<Futbolista> ordenar_nombre = new Comparator<Futbolista>() {
		@Override
		public int compare(Futbolista f1, Futbolista f2) {
			return f1.nombre.compareTo(f2.nombre);
		}
	};

	public static Comparator<Futbolista> ordenar_edad = new Comparator<Futbolista>() {
		@Override
		public int compare(Futbolista f1, Futbolista f2) {
			return Integer.compare(f1.edad, f2.edad);
		}
	};

}