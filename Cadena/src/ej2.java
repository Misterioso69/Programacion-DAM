import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String m = sc.nextLine();
        int cad =m.length();
        String res = !m.isEmpty() && cad>=3 ? m.substring(cad-3,cad) : "Esta vacia";
        System.out.println(res);
    }
}
