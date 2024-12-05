import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        boolean res = num>num2 && num>num3? true : false ;
        boolean res2 = num2>num && num2>num3? true : false ;
        String mes = res? "El primer numero es el mayor "+ num  : res2? "El mayor es el segundo " +num2: "El mayor es el tercero "+ num3;
        System.out.println(mes);
    }
}
