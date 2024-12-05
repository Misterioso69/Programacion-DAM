import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n = sc.nextInt();
        int mul = 0 ;
        if (n<=10 && n>=1) {
            for (int i = 1 ; i <=10; i++) {
                mul = i*n;
               System.out.println(n+" * "+ i + " = "+mul);
            }
        }else System.out.println("El numero no esta entre el 1 y 10");
    }
}
