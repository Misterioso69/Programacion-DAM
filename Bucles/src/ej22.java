import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();
        if (num != num2) {
            if (num > num2) {
                for(int i = num2 ; i <= num ; i+=7) {
                    System.out.println(i);

                }
            } else if (num < num2) {
                for(int i = num ; i <= num2 ; i+=7) {
                    System.out.println(i);

                }
            }
        }else System.out.println("Son iguales");
    }
}
