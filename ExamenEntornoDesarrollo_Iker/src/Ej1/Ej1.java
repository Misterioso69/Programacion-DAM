package Ej1;

/**

 Programa:
 Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
 contrario, el programa termina cuando se introduce un espacio.
 */

import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class Ej1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena;
		int longitud;
		char caracter;
		boolean entra = true;
// Solicitud de datos al usuario
		System.out.println("El programa analizará si los carácteres son vocales o no.");
		System.out.print("Introduce los carácteres a analizar, en caso de querer terminar "
				+ "el programa, introduce un espacio: ");
		while (entra) {
			cadena = scanner.nextLine().toUpperCase();
			int vocal = 0;
			int cons = 0 ;
			if (cadena.equals(" ")) {
				entra = false;
			} else {
				longitud = cadena.length();
				for (int i = 0; i < longitud; i++) {
					caracter = cadena.charAt(i);
					if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
						System.out.println("Detectada vocal " + caracter + ". Seguimos comprobando...");
						vocal++;
					} else {
						System.out.println("Detectada consonante " + caracter + ". Seguimos comprobando...");
						cons++;
					}
				}
				System.out.println("La cantidad de consonantes son "+cons+" de vocales "+vocal);
				System.out.print("Introduce nuevos carácteres a analizar, en caso de querer terminar "
						+ "el programa, introduce un espacio : ");
			}
		}
		System.out.println("FIN DEL PROGRAMA");
	}
}