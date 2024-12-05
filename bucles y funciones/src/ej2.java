import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();
        iterar(num, num2);
    }
    public static void iterar (int a , int b){
        if ( a >= b) {
            for (int i = b; i <= a; i++) {
                System.out.println("Numero " + i);
            }
        }else {
            for (int i = a; i <= b; i++) {
                System.out.println("Numero " + i);
            }
        }

    }
}
