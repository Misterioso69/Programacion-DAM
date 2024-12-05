import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        int num = sc.nextInt();
        int res =Math.abs(num);
        System.out.println(res);
    }
}
