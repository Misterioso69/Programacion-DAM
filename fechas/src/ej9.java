import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cadena que desees: ");
        String cad = scanner.nextLine();
        boolean res = (cad.length() != 1) ? true :false ;
        boolean res1 = cad.equals("a")|| cad.equals("e")|| cad.equals("i")|| cad.equals("o")|| cad.equals("u")||cad.equals("A")|| cad.equals("E")|| cad.equals("I")|| cad.equals("O")|| cad.equals("U") ? true :false ;
        boolean res2 = ((cad.compareTo("A") >= 0) && (cad.compareTo("Z") <= 0))? true : false ;
        String mes = res? "La cadena tiene mas de un caracter": res1? res2? "Es una vocal y es una letra mayúscula"  : "Es una vocal y es una letra minuscula" : "No es una vocal";
        System.out.println(mes);



    }
}