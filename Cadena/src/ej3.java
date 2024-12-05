import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String f = sc.nextLine();
        System.out.println("Ingrese cantidad de carecteres");
        int c = sc.nextInt();
        String res = !f.isEmpty() ? f.substring(0,c) : "Esta vacia";
        System.out.println(res);
    }
}
