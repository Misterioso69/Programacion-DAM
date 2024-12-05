import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para solucionar la ecuacion ax2 + bx + c = 0 dime los valores de a,b y c ");
        System.out.println("Dime el valor de a");
        float a = sc.nextFloat();
        System.out.println("Dime el valor de b");
        float b = sc.nextFloat();
        System.out.println("Dime el valor de c");
        float c = sc.nextFloat();
        double discri= Math.pow(b,2)-4*a*c;
        double raiz = Math.sqrt(discri);
        if (raiz >0){
            double sol1 = (-1*b+raiz)/(a*2) ;
            System.out.println(sol1);
            double sol2 = (-1*b-raiz)/(a*2) ;
            System.out.println(sol2);
        } else if (raiz==0) {
            double sol1 =  (-1*b)/(a*2);
            System.out.println(sol1);
        }else System.out.println("No tiene solucion");
    }
}
