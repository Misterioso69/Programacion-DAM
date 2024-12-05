import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String f = sc.nextLine();
        System.out.println("Ingrese un caracter");
        String c = sc.nextLine();
        f =f.replace(" ",c);
        System.out.println(f);
    }
}
