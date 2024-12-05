import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num % 5 == 0) {
                System.out.println("El numero es par y divisble entre 5");
            } else {
                System.out.println("El numero es par y  no es divisble entre 5");
            }
        }else {
           if (num % 5 == 0) {
               System.out.println("El numero no es par y divisble entre 5");
           }else {
               System.out.println("El numero no es par y  no es divisble entre 5");
           }
        }
    }
}
