import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [10] ;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            a[i] = sc.nextInt();
        }
        for (int i = 9; i>=0; i--) {
            System.out.print(a[i]+" , ");
        }
    }
}
