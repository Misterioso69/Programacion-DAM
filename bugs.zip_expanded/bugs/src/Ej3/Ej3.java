package Ej3;

/**

Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números
primos que queremos mostrar.

*/
import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class Ej3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numPrimos;
		int contador;
		boolean esPrimo;
		int divisor;
		int num;
// Inicio del programa, explicación al usuario
		System.out.println("El programa nos muestra una cantidad solicitada de números primos.");
// Pedimos datos al usuario
		System.out.print("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
		numPrimos = scanner.nextInt();
// Iniciamos el ciclo para calcular el tiempo.   
		contador = 1;
		num = 1;
		while (contador <= numPrimos) {
			divisor =1;
			int contador2 =0;
			while ((divisor <= num )) {
				if (num % divisor == 0) {
					contador2++;;
				}
				divisor ++;
			}
			if (contador2==2) {
				System.out.println(contador + ": " + num);
				contador++;
			}
			num ++;
		}
	}
}