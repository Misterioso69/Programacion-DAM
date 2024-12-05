import java.util.Scanner;

public class ej33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res =0;
        System.out.println("Dime cuantas horas trabajas");
        int n = sc.nextInt();
        if (n<=20) {
            res = n * 12;
        }else if (n>20 && n<=30) {
            res = n * 15;
        }else if (n>30) {
            res = n * 25;
        }else{
            System.out.println("Error");
        }
        System.out.println("El sueldo del empleao es de "+res+ "€");
    }
}
