import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir el primer numero ");
        int num = sc.nextInt();
        System.out.println("Escribir el numero exponencial ");
        int exp = sc.nextInt();
        int res = (int) Math.pow(num,exp);
        System.out.println("");
        System.out.println(res);
    }
}
