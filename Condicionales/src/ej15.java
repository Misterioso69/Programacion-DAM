import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        float nota1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        float nota2 = sc.nextFloat();
        int media = (int)(nota1 + nota2) / 2;
        if (media>=5) {
            System.out.println("Tu nota de Programacion es : " + media);
        }else if (media<5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            String resultado = sc.next();
            if (resultado.equals("apto")) {
                System.out.println("Tu nota de Programacion es : 5 ");
            }else if (resultado.equals("no")) {
                System.out.println("Tu nota de Programacion es : "+media);
            }else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
