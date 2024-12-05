import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0 ;
        int m = 0 ;
        System.out.println("Introduzca un numero ");
        int num = sc.nextInt();
        double ra = Math.sqrt(num); //Hacemos la raiz del numero introducido
        int num2 = (int) ra ; //Truncamos ese numero de la raiz para que nos de exacto
        if ( ra - num2 > 0){ //Restamos el numero de la raiz por el que esta truncado para saber si la raiz no es exacta
            for (int i = 1; i < ra; i++){ //En este bucle vamos elevando los numeros hasta que se acerque al numero de la raiz
                double x = Math.pow(i, 2);
                m = i ;
                n = x ;
            }
            System.out.println("La raiz cuadrada de "+num+" es de "+m+" elevado a dos que es "+(int)n+" y de resto "+(int)(num-n)); //Ponemos el numero el elevado mas cerca y el resto de el con el numero de la raiz
        }else {
            System.out.println("La raiz cuadrada de "+num+" es de "+(int)ra);
        }
    }
}
