import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase en minuscula");
        String f = sc.nextLine();
        String s = f.toUpperCase();
        System.out.println(s);
    }
}
