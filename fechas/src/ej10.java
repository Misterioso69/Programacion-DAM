import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero del 0 al 9  ");
        String cad = sc.nextLine();
        boolean lon = cad.length()==1? true : false;
        char carac = cad.charAt(0);
        String res = lon && Character.isDigit(carac)? "Es un numero del 0 al 9 " : "No es lo que se te pide  ";
        System.out.println(res);

    }
}