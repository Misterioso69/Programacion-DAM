import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean res;
        System.out.println("Dime un numero capicuo entre 0 y 9999");
        String num = sc.nextLine();
        if (num.length()<=1) {
            System.out.println("Numero no capicuo");
        } else if (num.length()<=2) {
            char n = num.charAt(0);
            char m = num.charAt(1);
            res = (n==m) ? true : false;
            String men = res ? "Es capicuo" : "No es capicuo";
            System.out.println(men);
        } else if (num.length()<=3) {
            char n = num.charAt(0);
            char m = num.charAt(2);
            res = (n==m) ? true : false;
            String men = res ? "Es capicuo" : "No es capicuo";
            System.out.println(men);
        } else if (num.length()<=4) {
            char n = num.charAt(0);
            char m = num.charAt(1);
            char m2 = num.charAt(2);
            char n2 = num.charAt(3);
            res = (n==n2 && m==m2) ? true : false;
            String men = res ? "Es capicuo" : "No es capicuo";
            System.out.println(men);
        }else {
            System.out.println("Numero no valido");
        }
    }
}
