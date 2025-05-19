package ejercicio1;

public class Plato {
	private String nombre;
	public String [] tipoPlato  = new String[] {"entrada","pricipal","postre"};
	private float precio ;
	private int tipo;
	
	public Plato ( String nombre ,int tipo ,float precio){
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", tipoPlato=" + tipoPlato[tipo] + ", precio=" + precio  + "]";
	}

	public Plato() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
