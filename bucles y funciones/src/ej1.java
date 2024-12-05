import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        eco (num);
    }
    public static void eco (int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("eco");
        }
    }
}
