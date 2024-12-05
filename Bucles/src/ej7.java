import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n = sc.nextInt();
        int mul = 0 ;
        for (int i = 1 ; mul<100; i++) {
            mul = i*n;
            if (mul <=100) {
                System.out.println(mul);
            }
        }
    }
}
