import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        for (int j = num; j<=(num+5); j++) {
            System.out.println(" | "+j+" | "+(j*j)+" | "+(j*j*j)+" | ");
        }
    }
}
