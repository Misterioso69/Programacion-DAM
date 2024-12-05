import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        double des = 0;
        System.out.println("Que dia de la semana es ");
        String d = sc.nextLine().toLowerCase();
        System.out.println("Cuanto es el precio ");
        double p = sc.nextDouble();
        if (d.equals("martes")||d.equals("juanes")){
           des = p * 0.15;
           res = p - des ;
        }else {
             res = p;
        }
        System.out.println("El precio final es de : "+res+" y el descuento es de : "+des);
    }
}
