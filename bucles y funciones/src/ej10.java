import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero ");
        int a = sc.nextInt();
        System.out.println("Introduzca a que otra moneda quieres cambiar ");
        String b = sc.next().toLowerCase();
        cambio(a, b);
    }
    public static void cambio(int a , String b){
        double res = 0 ;
        final double dol =1.28611 ;
        final double yen =129.852 ;
        final double li =0.86 ;
        switch (b){
            case "dolar": res=a*dol;break;
            case "yenes": res=a*yen;break;
            case "libra": res=a*li;break;
            default: System.out.println("Opcion no valida");break;
        }
       System.out.println( "El cambio de "+a+"€ a "+b+" es igual a "+res);
    }
}
