package Ej1;
import java.util.Scanner;
/**
 *
 *    Escribe un programa que pida 10 números por teclado y que luego muestre los
 *    números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 *    máximo y del mínimo respectivamente.
 *
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] numero = new int[10];
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;
        
        System.out.println("Programa que pide 10 números y calcula el máximo y mínimo.");
        for (i=0;i<10;i++) {
            System.out.print("Introduce el número "+(i+1)+": ");
            numero[i] = scanner.nextInt();
            if (numero[i]<minimo || minimo == -2147483648) {
                minimo  = numero[i];
            }
            if (numero[i]>maximo || maximo == 2147483647 ) {
                maximo = numero[i];
            }
        }
        for (i=0; i<10;i++) {
            if (numero[i]==maximo) {
                System.out.println("Número "+ (i+1)+": "+numero[i] + " máximo.");
                }
            if (numero[i]== minimo) {
                System.out.println("Número "+ (i+1)+": "+numero[i] + " mínimo.");
            }else {
                System.out.println("Número "+ (i+1)+": "+numero[i]);
            }
        }
    }
}