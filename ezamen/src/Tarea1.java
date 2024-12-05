import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int con = 0;
        if (num>=0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.print("Y los numeros primos son : ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            con++;
                        }
                    }
                    if (con==2) System.out.print(i+" ");
                    con=0;
                }
            }
        }else System.out.println("error");
    }
}
