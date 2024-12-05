import java.util.Scanner;

public class ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res ;
        System.out.println("Dime tu nombre ");
        String nombre = sc.nextLine();
        System.out.println("Dime la cantidad de articulos comprados ");
        int art = sc.nextInt();
        if (art<5){
            res ="efectivo";
        }else if (art>=5 && art<=12){
            res ="tarjeta";
        }else {
            res ="cheque";
        }
        System.out.println("El pago del cliente "+nombre+" se hace mediante "+res);
    }
}
