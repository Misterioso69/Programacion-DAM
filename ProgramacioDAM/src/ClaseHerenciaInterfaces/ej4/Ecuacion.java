package ClaseHerenciaInterfaces.ej4;

public class Ecuacion {
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Ecuacion [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public Ecuacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ecuacion (double a ,double b , double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double Discriminante () {
		double discriminante = (b*b)-(4*a*c);
		return discriminante;
	}
	public double segundoGradoPosi() {
		return (-(b)+Math.sqrt(Discriminante())/(2*a));
	}
	public double segundoGradoNega() {
		return (-(b)-Math.sqrt(Discriminante())/(2*a));
	}
	public double segundoGrado() {
		return (-b/(2*a));
	}
	public void infoEcuacion () {
		if (Discriminante()>0) {
			System.out.println("El discriminante es positivo y las soluciones son x1:"+segundoGradoPosi()+" y x2:"+segundoGradoNega());
		}else if (Discriminante()==0) {
			System.out.println("La unica solucion es:"+segundoGrado());
		}else if (Discriminante()<0) {
			System.out.println("No tiene solucion ");
		}
	}
}
