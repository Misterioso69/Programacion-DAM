package ejercicio2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;

public class Alimento extends Productos {
	private String fechaCaducidad;
	
	
	public Alimento(String codigoBarras, String nombre, double precio, int stock, String fechaCaducidad) {
		super(codigoBarras, nombre, precio, stock);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
	@Override
	public String toString() {
		return super.toString()+" Alimento [fechaCaducidad=" + fechaCaducidad + "]";
	}

	@Override
	public double calcularDescuento() { //Muestra el precio del producto con el descuento si es que tiene
		// TODO Auto-generated method stub
		double res = precio;
		char[] a = fechaCaducidad.toCharArray();
		int anio = (a[0]-48)*1000+(a[1]-48)*100+(a[2]-48)*10+(a[3]-48);
		int mes = (a[5]-48)*10+a[6]-48;
		int dia=(a[8]-48)*10+a[9]-48;
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		if(LocalDate.now().plusDays(3).isBefore(fecha)) {
			res = precio*0.8;
		}
		return res;
	}
	
}
