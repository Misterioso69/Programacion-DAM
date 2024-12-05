import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero" );
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo numero" );
        int b = sc.nextInt();
        int menor = Math.min(a, b); //Aqui sacamos el numero menor
        for (int i = menor ; i>0 ; i --){ //En este bucle lo que hacemos es que "i" sea el numero menor
            if (a%i == 0 && b%i == 0){ //Aqui hacemos el modulo de "a" y "b" entre la variable "i" y si es igual a 0 entra y se pone el MCD de ambos
                System.out.println("El MCD es "+i);
                break;
            }
        }
    }
}
