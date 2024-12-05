import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int n = sc.nextInt();
        System.out.println("Dime un exponente a ese numero  ");
        int exp = sc.nextInt();
        if (exp>0){
            double res = Math.pow(n,exp);
            System.out.println("El resultado de la potencia es : "+(int)res);
        } else if (exp==0) {
            double res = Math.pow(n,exp);
            System.out.println("El resultado de la potencia es : "+(int)res);
        } else if (exp<0) {
            double res = Math.pow(n,exp);
            System.out.println("El resultado de la potencia es : "+res);
        }else {
            System.out.println("Error");
        }
    }
}