import java.util.Arrays;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] =  new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            a[i] = sc.nextInt();
        }
        int b [] = new int[10];
        int con = 0 ;
        int d = 9 ;
        for (int i = 0; i < 10; i++) {
            if (esPrimo(a[i])) {
                b[con++] = a[i];
            }else {
                b[d--] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
