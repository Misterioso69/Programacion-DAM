package ClaseHerenciaInterfaces.ej7;

public class Producto {
	private String nombre;
	private double precio ;
	private int cant ;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cant=" + cant + "]";
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(String nombre , double precio , int cant) {
		this.nombre = nombre ;
		this.precio = precio;
		this.cant = cant;
	}
}
