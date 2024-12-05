import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero para saber su ultimo digito");
        int n = sc.nextInt();
        if (n>0 ){
            int res = n %10 ;
            System.out.println("EL ultima digto es "+res);
        }else {
            System.out.println("El numero no es valido");
        }

    }
}
