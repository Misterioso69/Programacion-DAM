import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int num = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        int num3 = sc.nextInt();
        if (num > num2 && num > num3) {
            System.out.println("El primer numero es "+num);
            if (num2>num3) {
                System.out.println("El segundo numero es "+num2);
                System.out.println("El tercer numero es "+num3);
            } else {
                System.out.println("El segundo numero es "+num3);
                System.out.println("El tercer numero es "+num2);
            }
        } else if (num2 > num && num2 > num3) {
            System.out.println("El primer numero es " + num2);
            if (num > num3) {
                System.out.println("El segundo numero es " + num);
                System.out.println("El tercer numero es " + num3);
            } else {
                System.out.println("El segundo numero es " + num3);
                System.out.println("El tercer numero es " + num);
            }
        } else if (num3 > num2 && num3 > num) {
            System.out.println("El primer numero es " + num3);
            if (num2 > num) {
                System.out.println("El segundo numero es " + num2);
                System.out.println("El tercer numero es " + num);
            } else {
                System.out.println("El segundo numero es " + num);
                System.out.println("El tercer numero es " + num2);
            }
        } else {
            System.out.println("Son iguales");
        }
    }
}