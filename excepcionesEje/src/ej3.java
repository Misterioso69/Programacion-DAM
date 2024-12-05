import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        double vector [] = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            boolean valor =  false ;
            while (!valor) {
                try {
                    System.out.println("Introduzca un valor: ");
                    vector[i] = sc.nextDouble();
                    valor = true;
                }catch (InputMismatchException e) {
                    System.out.println("Valor invalido, ingrese de nuevo un numero");
                    sc.nextLine();
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posicion :"+i+" tiene el valor "+vector[i]);
        }
    }
}
