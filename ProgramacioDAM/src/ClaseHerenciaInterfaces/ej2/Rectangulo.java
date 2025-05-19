package ClaseHerenciaInterfaces.ej2;

public class Rectangulo {
	private double altura ;
	private double base ;
	public Rectangulo( double altura , double base ) {
		this.altura =  altura ;
		this.base = base ;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public Rectangulo() {
		super();
	}
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}
	
	public double Area () {
		return altura*base ;
	}
	public double Perimetro() {
		return 2*(base+altura);
	}
	public void Resultado () {
		double area = Area() ;
		double perimetro = Perimetro();
		System.out.println("El rectangulo con base: "+base+" y de altura: "+altura+"\nEl area es: "+area+" y el Perimetro es: "+perimetro);
	}
	
}