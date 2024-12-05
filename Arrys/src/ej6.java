import java.util.Arrays;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number ");
            a[i] = sc.nextInt();
        }
        int ulimo = a[14];
       for (int i = 13 ; i>= 0; i--){
           a[i+1] = a[i];
       }
       a[0]=ulimo;
        System.out.println(Arrays.toString(a));
    }
}
