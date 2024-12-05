import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        int[] a = new int[8];
        String[] b = new String[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter number ");
            a[i] = sc.nextInt();
            if (a[i]%2==0){
                b[i] = "Par";
            }else {
                b[i] = "Impar";
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(a[i] + " "+b[i]);
        }
    }
}
