import java.util.Scanner;

public class ej34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res=0 ;
        final double h = 0.05;
        final double y = 0.08;
        final double s = 0.1;
        final double r = 0.02;
        System.out.println("Dime el precio de tu moto");
        int n = sc.nextInt();
        System.out.println("Dime la marca de tu moto");
        String mar = sc.next().toLowerCase() ;
        if (mar.equals("honda")){
            res = (int) (n-(n *h));
        } else if (mar.equals("yamaha")) {
            res = (int) (n-(n*y));
        }else if (mar.equals("suzuki")) {
            res = (int) (n-(n*s));
        }else {
            res = (int) (n-(n*r));
        }
        System.out.println("El precio final es de "+res);
    }
}
