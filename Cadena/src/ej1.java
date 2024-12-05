import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Introduce una frase");
        Scanner sc=new Scanner(System.in);
        String cadena=sc.nextLine();
        String resultado = !cadena.isEmpty() ? cadena.substring(0,2) :"Está vacía, no se puede hacer la operación";
        System.out.println(resultado);
    }
}
