import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        boolean res = num>=0 && num<=100 ? true : false;
        boolean res1 = num%2==0 ? true : false;
        String mes = res? res1? "Es par" : "Es impar" : "Error" ;
        System.out.println(mes);
    }
}
