import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("EL factorial es : "+fact(num));
    }
    public static int  fact ( int a){
        int res = 0 ;
        if (a == 0){
             res = 1;
        }else {
            res = a * fact(a-1);
        }
        return res;
    }
}
