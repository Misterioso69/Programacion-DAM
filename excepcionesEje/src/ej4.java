import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random()*100+1);
        int vector [] = new int[a];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int)(Math.random()*100+1);
        }
        for (int i = 0; i < 1; i++) {
            while (true){
                System.out.println("Introduzca una posicion entre ( 0 : "+(a-1)+" ) o un valor negativo para salir" );
                try {
                    int si = sc.nextInt();
                    if (si<0){
                        System.out.println("El programa se ha finalizado");
                        break;
                    }
                    if (si >= 0 && si < a) {
                        System.out.println("Valor en la posición " + si + ": " + vector[si]);
                    } else {
                        System.out.println("Error: La posición está fuera del rango del vector.");
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Error: introduzacala de nuevo");
                    sc.nextLine();
                }catch (NoSuchElementException e) {
                    System.out.println("Error: introduzacala de nuevo");
                    sc.nextLine();
                }catch (IllegalStateException e) {
                    System.out.println("Error: introduzacala de nuevo");
                    sc.nextLine();
                }catch (Exception e) {
                    System.out.println("Error: introduzacala de nuevo");
                    sc.nextLine();
                }
            }

        }
    }
}
