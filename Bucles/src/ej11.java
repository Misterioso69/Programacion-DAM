import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = 1 ;
        System.out.println("Dime un numero: ");
        int n = sc.nextInt();
        for (int i = n; i >0; i--) {
            fac = fac*i;
        }
        System.out.println(fac);
    }
}
