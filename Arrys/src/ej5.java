import java.util.Arrays;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        int maximo , minimo;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number ");
            a[i] = sc.nextInt();
        }
        maximo = a[0];
        minimo = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximo) {
                maximo = a[i];
            }
            if (a[i] < minimo) {
                minimo = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            if (a[i] == maximo) {
                System.out.print("maximo");
            }
            if (a[i] == minimo) {
                System.out.print("minimo");
            }
            System.out.print(",");
        }
    }
}
