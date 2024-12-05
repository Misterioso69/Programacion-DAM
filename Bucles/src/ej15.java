import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = i + 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
