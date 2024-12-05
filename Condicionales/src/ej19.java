import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un  lado de un triangulo");
        int n = sc.nextInt();
        System.out.println("Dime un lados de un triangulo");
        int m = sc.nextInt();
        System.out.println("Dime un lados de un triangulo");
        int a = sc.nextInt();
        boolean  res1 = n == Math.sqrt(Math.pow(m, 2) + Math.pow(a, 2));
        boolean res2 = m == Math.sqrt(Math.pow(a, 2) + Math.pow(n, 2));
        boolean res3 = a == Math.sqrt(Math.pow(m, 2) + Math.pow(n, 2));

        if (res1||res2||res3) {
            System.out.println("El triangulo es rectangulo");
        } else if (n == m && m == a) {
            System.out.println("El triangulo es equilatero");
        } else if (n == m && m != a || m == a && n != m || n == a && m != n) {
            System.out.println("El triangulo es  isosceles");
        } else if (n != m && m != a) {
            System.out.println("El triangulo es escaleno");
        }
    }
}
