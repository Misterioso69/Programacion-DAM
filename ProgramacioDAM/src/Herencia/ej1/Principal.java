package Herencia.ej1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vehiculo v = new Vehiculo();
		Bicicleta b = new Bicicleta();
		Coche c = new Coche();
		
		int opcion = 0;
		
		while ( opcion != -1) {
			
			System.out.println("1. Anda con la bicicleta\n"
					+ "2. Haz el caballito con la bicicleta\n"
					+ "3. Anda con el coche\n"
					+ "4. Quema rueda con el coche\n"
					+ "5. Ver kilometraje de la bicicleta\n"
					+ "6. Ver kilometraje del coche\n"
					+ "7. Ver kilometraje total\n"
					+ "8. Salir\n"
					+ "Elige una opción (1-8):\n"
					+ "");
			opcion = sc.nextInt();
			
			
			if (opcion == 1) {
				
				System.out.println("Cuantos km has recorrido?");
				int km = sc.nextInt();
				
				b.andaConLaBicicleta(km);
			} else if ( opcion == 2) {
				
				System.out.println("Cuanto tiempo has hecho el caballito?");
				int tiempo = sc.nextInt();
				
				b.caballito(tiempo);
				
			} else if (opcion == 3) {
				
				System.out.println("Cuantos km has recorrido?");
				int km = sc.nextInt();
				
				c.andaConCoche(km);
				
			} else if ( opcion == 4 ) {
				
				System.out.println("Cuanto tiempo has quemado rueda?");
				int tiempo = sc.nextInt();
				
				c.quemaRueda(tiempo);
				
			} else if ( opcion == 5 ) {
				
				System.out.println(b);
				
			} else if ( opcion == 6 ) {
				
				System.out.println(c);
				
			} else if ( opcion == 7 ) {
				
				int tBici = 0;
				tBici= b.totalbici();
				int tCoche = 0;
				tCoche = c.totalcoche();
				
				System.out.println(v.getKilometrosTotales());
				
			} else if ( opcion == 8 ) {
				
				System.out.println("Has salido");
				opcion = -1;
				
			}
			
		}
		
		
		
		
	}

}