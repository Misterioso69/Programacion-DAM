import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero ");
        int num = sc.nextInt();
        priomoh(num);
    }
    public static void priomoh (int num){
        int con = 0 ;
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
    }
}
