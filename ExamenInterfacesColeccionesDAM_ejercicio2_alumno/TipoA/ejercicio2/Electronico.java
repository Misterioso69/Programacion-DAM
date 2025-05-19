package ejercicio2;

public class Electronico extends Productos {
	private int garantiaMeses;
	
	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	public Electronico(String codigoBarras, String nombre, double precio, int stock, int garantiaMeses) {
		super(codigoBarras, nombre, precio, stock);
		this.garantiaMeses = garantiaMeses;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Electronico [garantiaMeses=" + garantiaMeses + "]";
	}

	@Override
	public double calcularDescuento() { //Muestra el precio del producto con el descuento si es que tiene
		// TODO Auto-generated method stub
		double res = precio;
		if(garantiaMeses<=6) {
			res=precio*0.9;
		}
		return res;
	}
}
