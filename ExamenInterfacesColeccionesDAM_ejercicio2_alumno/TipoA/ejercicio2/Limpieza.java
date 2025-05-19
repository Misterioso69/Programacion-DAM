package ejercicio2;

public class Limpieza extends Productos {
	private boolean esToxico;
	
	public Limpieza(String codigoBarras, String nombre, double precio, int stock, boolean esToxico) {
		super(codigoBarras, nombre, precio, stock);
		this.esToxico = esToxico;
	}
	
	public boolean isEsToxico() {
		return esToxico;
	}

	public void setEsToxico(boolean esToxico) {
		this.esToxico = esToxico;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Limpieza [esToxico=" + esToxico + "]";
	}

	@Override
	public double calcularDescuento() { //Muestra el precio del producto con el descuento si es que tiene
		double res = precio;
		if(esToxico) {
			res=precio*0.95;
		}
		return res;
	}
	
}
