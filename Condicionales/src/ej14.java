import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de maximo 5 cifras, para sacarte el primer digito");
        int n = sc.nextInt();
        if (n<10){
            System.out.println("El primer digito es: "+n);
        } else if (n<100){
            int sol = n /10;
            System.out.println("El primer digito es: "+ sol);
        } else if (n<1000){
            int sol = n / 100;
            System.out.println("El primer digito es: "+ sol);
        } else if (n<10000){
            int sol = n / 1000;
            System.out.println("El primer digito es: "+ sol);
        } else if (n<100000){
            int sol = n / 10000;
            System.out.println("El primer digito es: "+ sol);
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
