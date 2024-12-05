import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        boolean a = false;
        boolean e = false;
        boolean ih = false;
        boolean o = false;
        boolean u = false;
        for (int i = 0; i <= palabra.length()-1; i++) {
            if (palabra.charAt(i) == 'a') {a = true; }
            if (palabra.charAt(i) == 'e') {e = true; }
            if (palabra.charAt(i) == 'i') {ih = true; }
            if (palabra.charAt(i) == 'o') {o = true; }
            if (palabra.charAt(i) == 'u') {u = true; }
        }
        if (a && e && ih && o && u) {
            System.out.println("Es una palabra pentavocalica");
        }else {
            System.out.print("No es una palabra pentavocalica la/las vocales que faltan son : ");
            if (a==false){ System.out.print("a "); }
            if (e==false){ System.out.print("e "); }
            if (ih==false){ System.out.print("i "); }
            if (o==false){ System.out.print("o "); }
            if (u==false){ System.out.print("u "); }
        }
    }
}
