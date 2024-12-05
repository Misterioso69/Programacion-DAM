import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di a que planta quieres ir ");
        int n = sc.nextInt();
        asc(n);
    }
    public static void asc (int a){
        for (int i = 1; i <= a; i++) {
            System.out.println("Sube al piso "+i);
        }
    }
}
