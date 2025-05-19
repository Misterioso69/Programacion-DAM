package ClaseHerenciaInterfaces.ej6;

import java.util.Arrays;

public class Estudiante {
	private String nomber ;
	private int edad;
	private double [] calificaciones = new double [5];
	private int cont =0;
	
	public String getNomber() {
		return nomber;
	}
	public void setNomber(String nomber) {
		this.nomber = nomber;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(double[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	@Override
	public String toString() {
		return "Estudiante [nomber=" + nomber + ", edad=" + edad + ", calificaciones=" + Arrays.toString(calificaciones)
				+ "]";
	}
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nomber , int edad , double []calificaciones) {
		this.nomber = nomber;
		this.edad = edad;
		this.calificaciones = calificaciones;
	}
	public void agreCalifi (double nota) {
		if (cont < calificaciones.length) {
			calificaciones[cont] = nota;
			cont ++;
		}else {
			System.out.println("Ya estan las calificaciones");
		}
	}
	public double calcularPro () {
		double prome = 0;
		double suma = 0;
		for (int i = 0 ; i<calificaciones.length;i++) {
			suma += calificaciones[i];
		}
		prome= suma/calificaciones.length;
		return prome ;
	}
	public void infoEstu () {
		System.out.println("Nombre: "+nomber+" edad: "+edad+" y el promedio es: "+ calcularPro());
	}
}
