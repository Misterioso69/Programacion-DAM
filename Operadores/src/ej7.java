import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un lado: ");
        int n = sc.nextInt();
        System.out.println("Dime un lado: ");
        int m = sc.nextInt();
        System.out.println("Dime un lado: ");
        int a = sc.nextInt();
        boolean res = n==m && n==a? true : false;
        boolean res2 = (n==m && n!=a)||(n!=m && n==a)||(m!=n && m==a) ? true : false;
        String mes = res? "Es equilatero" : res2? "Es isoscele" : "Es escaleno";
        System.out.println(mes);
    }
}