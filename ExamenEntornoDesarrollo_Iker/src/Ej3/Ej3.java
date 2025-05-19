package Ej3;

/**

 Programa:
 Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,
 el segundo 20 €, el tercero 40 € y así sucesivamente, es decir, cada cuota es el doble de la anterior.
 Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de
 los 20 meses.
 Este programa puede servir para calcular otras compras y con
 diferentes plazos.

 */
import java.util.Scanner;

// Inicio del programa y declaración de variables:
public class Ej3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double cuota;
		int mensualidades;
		double totalPagado = 0;
// Inicio del programa, explicación al usuario
		System.out.println(
				"El programa calcula la cuota correspondiente al pago mensual y el total a pagar al final de la financiación  por la compra de un producto.");
// Pedimos datos al usuario
		System.out.print("Introduce la primera cuota a pagar: ");
		cuota = scanner.nextDouble();
		System.out.print("Introduce el número de meses de financiación: ");
		mensualidades = scanner.nextInt();
		totalPagado = cuota;
		for (int i = 1; i < mensualidades; i++) {
			cuota *= 2;
			System.out.println("Cuota " + (i + 1) + ": " + cuota);
			totalPagado = totalPagado + cuota;

		}
// Mostramos el resultado
		System.out.println("Total pagado por el producto: " + (int) totalPagado);
	}
}