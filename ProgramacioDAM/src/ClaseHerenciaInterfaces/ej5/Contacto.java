package ClaseHerenciaInterfaces.ej5;

public class Contacto {
	private String nombre;
	private String telf;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telf=" + telf + "]";
	}
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacto (String nombre , String telf) {
		this.nombre = nombre;
		this.telf = telf;
	}
}
