import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Digite um numero: ");
        a = sc.nextInt();
        boolean res = (a%2)==(a%3)?true:false;
        String mes = res? "Es multiplo de 2 y 3 " : "No es multiplo de 2 y 3 ";
        System.out.println(mes);
    }
}
