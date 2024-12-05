import java.util.Scanner;

public class ej32 {
    public static void main(String[] args) {
        int res = 0 ;
        System.out.println("Dime tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("Dime la cantidad de ruedas que deseas: ");
        int rue = sc.nextInt();
        if(rue<=12){
            res = 300*rue;
        }else {
            res = 280*rue;
        }
        System.out.println("El pago del cliente "+nom+" se hace mediante "+res);
    }
}
