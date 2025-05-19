package Ej2;
import java.util.Scanner;
/**
 *
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la imagen
 *  de arriba.
 Ejemplo de ejecución:

 Introduce el número de niveles que tendrá la pirámide:
 6
      1
     121
    12321
   1234321
  123454321
 12345654321


 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
        int numeroNiveles = scanner.nextInt();

        int numeroPosiciones = numeroNiveles * 2 -1;
        int posInicial = numeroNiveles;
        int posFinal = numeroNiveles;


        for (int i =1; i <= numeroNiveles; i++) {
            int contador = 1;
            String resultado = "";

            for (int j=0; j <= numeroPosiciones; j++) {
                if ((j < posInicial) || (j > posFinal)) {
                    resultado += " ";
                } else {
                    if (j < numeroPosiciones/2+1) {
                        resultado += contador;
                        contador++;
                    } else {
                        resultado += contador;
                        contador--;
                    }
                }
            }
            System.out.println(resultado);
            posFinal++;
            posInicial--;
        }
    }
}