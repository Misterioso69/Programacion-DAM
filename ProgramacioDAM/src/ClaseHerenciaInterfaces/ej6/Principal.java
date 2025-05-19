package ClaseHerenciaInterfaces.ej6;

import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		Estudiante e = new Estudiante();
		e.setNomber("Tomi");
		e.setEdad(19);
		for (int i = 0 ;i<5;i++) {
			System.out.println("Añade una nota ");
			double a = sc.nextInt();
			e.agreCalifi(a);
		}
		e.infoEstu();
		
		
	}
}
