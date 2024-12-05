import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0 ;
        int contador = 0 ;
        int n = 0 ;
        while (true){
            System.out.println("Di la altura de un arbol: ");
            int al = sc.nextInt();
            if (al == -1){
                System.out.println("Se cierra el programa.");
                break;
            }
            if ( max == 0 || al>max ){
                max=al ;
                n=contador ;
            }
            contador++;
        }
        System.out.println("El arbol mas grande es de indentidad "+n+" y su altura es de "+max);
    }
}
