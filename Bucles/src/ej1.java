import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Numero es par " + num);
            }
            if (num>=0){
                System.out.println("Numero es positivo " + num);
            }
            System.out.println("El cuadrado del numero es " + Math.pow(num, 2));
            System.out.println("Dime un numero");
            num = sc.nextInt();
        }
    }
}
