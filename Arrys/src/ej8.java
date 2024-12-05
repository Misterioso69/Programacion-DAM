import java.util.Arrays;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2] [13];
        a[0]= new int[]{2015, 18, 19, 20, 25, 28, 26, 21, 23, 21, 20, 19, 17};
        a[1]= new int[]{2016, 18, 19, 20, 25, 28, 26, 21, 23, 21, 20, 19, 17};
        System.out.println("Dime un año (2015/2016)");
        int n = sc.nextInt();
        if (n==a[0][0]){
            for (int i = 0 ; i < a[0].length ; i++){
                System.out.print(a[0][i] + " ");
            }
        } else if (n==a[1][0]) {
            for (int i = 0 ; i< a[1].length ; i++){
                System.out.print(a[1][i] + " ");
            }
        }else {
            System.out.println("Opcion no valida");
        }

    }
}
