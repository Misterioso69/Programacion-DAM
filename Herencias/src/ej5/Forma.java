package ej5;
public class Forma{
	private String color;
	private int cordenadoX;
	private int cordenadoY;
	private String nombre_forma;
	public Forma(String color, int cordenadoX, int cordenadoY, String nombre_forma) {
		super();
		this.color = color;
		this.cordenadoX = cordenadoX;
		this.cordenadoY = cordenadoY;
		this.nombre_forma = nombre_forma;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCordenadoX() {
		return cordenadoX;
	}
	public void setCordenadoX(int cordenadoX) {
		this.cordenadoX = cordenadoX;
	}
	public int getCordenadoY() {
		return cordenadoY;
	}
	public void setCordenadoY(int cordenadoY) {
		this.cordenadoY = cordenadoY;
	}
	public String getNombre_forma() {
		return nombre_forma;
	}
	public void setNombre_forma(String nombre_forma) {
		this.nombre_forma = nombre_forma;
	}
	public Forma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void imprimir () {
		System.out.print("Color "+color+" CordenadaX "+cordenadoX+" CordenadaY "+cordenadoY+" Forma "+nombre_forma);
	}
	public void obtener_cambiar_color (String a) {
		if ( a == null) {
			System.out.println("Tu color no puede ser nulo");
		}else {
			color = a ;
			System.out.println("El color a cambiado a "+color);
		}
	}
	public void mover_forma (int i , int j) {
		cordenadoX = i ;
		cordenadoY = j ;
		System.out.println(" El nuevo punto de la coordenada X es " + i + " y el de la Y es " + j);
	}
	@Override
	public String toString() {
		return "Forma [color=" + color + ", cordenadoX=" + cordenadoX + ", cordenadoY=" + cordenadoY + ", nombre_forma="
				+ nombre_forma + "]";
	}
		
	
}