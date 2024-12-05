import java.util.Scanner;

public class ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter da igual en mayusculas o minusculas");
        String car = sc.nextLine();
        char c1 = car.charAt(0);
        if (c1>=65 && c1<=90) {
            System.out.println("Mayusculas");
        }else if (c1>=97 && c1<=122) {
            System.out.println("Minusculas");
        }else {
            System.out.println("No es una letra");
        }
    }
}
