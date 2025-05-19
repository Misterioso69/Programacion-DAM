package ej5;

public class Rectangulo extends Forma {
	private int lado_menor;
	private int lado_mayor;
	
	
	public Rectangulo(int lado_menor, int lado_mayor) {
		super();
		this.lado_menor = lado_menor;
		this.lado_mayor = lado_mayor;
	}
	
	public Rectangulo(String color, int cordenadoX, int cordenadoY, String nombre_forma) {
		super(color, cordenadoX, cordenadoY, nombre_forma);
	}

	public int getLado_menor() {
		return lado_menor;
	}
	public void setLado_menor(int lado_menor) {
		this.lado_menor = lado_menor;
	}
	public int getLado_mayor() {
		return lado_mayor;
	}
	public void setLado_mayor(int lado_mayor) {
		this.lado_mayor = lado_mayor;
	}
	@Override
	public String toString() {
		return "Rectangulo [lado_menor=" + lado_menor + ", lado_mayor=" + lado_mayor + "]";
	}
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void calcular_area () {
		int are = (lado_mayor*lado_menor);
		System.out.println("El area vale:"+are);
	}
	public void calcular_perimetro() {
		int per = (2*lado_mayor+lado_menor*2);
		System.out.println("El perimetro es de: "+per);
	}
	public void cambiar_tamaño (double a ) {
		lado_mayor= (int) (lado_mayor*a);
		lado_menor = (int) (lado_menor*a);
		System.out.println("El lado mayor a cambiado a "+lado_mayor);
		System.out.println("El lado menor a cambiado a "+lado_menor);
	}
	
	public void imprimir () {
		super.imprimir();
		System.out.println(" Lado Mayor "+lado_mayor+" Lado Menor "+lado_menor);
	}
}
