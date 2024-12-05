import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la edad de los alumnos (Numero negativo para terminar)");
        int numalum = 0 ;
        int mayoreda = 0;
        int sumeda = 0;
        int edadalum = sc.nextInt();
        while (edadalum > 0){
            sumeda = sumeda+edadalum;
            if (edadalum >=18){
                mayoreda ++;
            }
            numalum ++ ;
            System.out.println("Introduce la edad de los alumnos (Numero negativo para terminar)");
            edadalum = sc.nextInt();
        }
        System.out.println("La suma de los alumnos es: " + sumeda);
        System.out.println("La media de edad de los alumnos es: " + (sumeda/numalum));
        System.out.println("El numero de alumnos es: " + numalum);
        System.out.println("Alumnos de mayor de edad son "+mayoreda);
    }
}
