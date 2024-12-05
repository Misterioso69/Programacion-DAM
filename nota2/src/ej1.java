import java.util.Arrays;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int b [] = new int[0];
        int ueba [] = new int [50000];
        int n = 1 ;
        int con = 0;
        while (a) {
            int pr [] = new int[n];
            System.out.println("Pon el numero del dorsal (-1 termina ) ");
            int num = sc.nextInt();
            if (num == -1) {
              break;
            }
            ueba[con] = num;
            pr [con++] = num;
            n++;
            b=pr;
            System.out.println();
        }
        b = Arrays.copyOf(ueba,n);
        System.out.println(Arrays.toString(b));
    }
}
