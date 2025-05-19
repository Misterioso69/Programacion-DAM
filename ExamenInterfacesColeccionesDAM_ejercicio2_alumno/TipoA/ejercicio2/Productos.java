package ejercicio2;

import java.util.Objects;

public abstract class Productos  implements Comparable<Productos>{
	private String codigoBarras;
	private String nombre;
	protected double precio;
	private int stock;
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Productos(String codigoBarras, String nombre, double precio, int stock) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Productos [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", precio=" + precio + ", stock="
				+ stock + "]";
	}
	
	public void reponerStock(int cantidad) { //Añade cantidad de productos
		stock += cantidad;
		System.out.println("El stock se ha repuesto y hay"+stock);
	}
	public boolean vender(int cantidad) { // Resta cantidad de productos
		if(cantidad<=stock) {
			System.out.println("Se han vendido todos los productos");
			stock = stock-cantidad;
			return true;
		}
		return false;
	}
	public abstract double calcularDescuento();
	
	public int compareTo (Productos o) { //Compara por el precio
		return (int) (this.precio - o.precio);
	}
	
}
