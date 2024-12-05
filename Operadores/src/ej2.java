import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int m ;
        System.out.println("Dime un numero n : ");
        n = sc.nextInt();
        System.out.println("Dime un numero m : ");
        m = sc.nextInt();
        String res= n>m? "n>m" : "n<m" ;

        System.out.println(res);
    }
}
