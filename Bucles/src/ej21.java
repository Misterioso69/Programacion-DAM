import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i = num ; i<= num+100 ;i++){
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}
