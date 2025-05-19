package ExamenDamBEj1;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{
	private String dni ;
	private String nombre;
	private String fecha;
	private int cuota;
	
	public Usuario(String dni, String nombre, String fecha, int cuota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.cuota = cuota;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", cuota=" + cuota + "]";
	}

	@Override
	public int compareTo(Usuario o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.getDni());
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
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}
	
}