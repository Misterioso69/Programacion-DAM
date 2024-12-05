import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        double res = 0 ;
        double des = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto cuesta : ");
        double p = sc.nextDouble();
        System.out.println("Como lo paga : (contado/targeta) ");
        String s = sc.next().toLowerCase() ;
        switch (s) {
            case "contado": des = p*0.05;
                res = p - des;
            break;
            case "tarjeta": des = p*0.03;
                res = p + des;
            break;
            default: System.out.println("Error");
            break;
        }
        System.out.println("El precio final es de : "+res+" y el descuento de : "+des);
    }
}
