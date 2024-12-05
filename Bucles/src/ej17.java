import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = 0 ;
        int suma = 0 ;
        System.out.print("Para cerrar el programa pon un numero negativo. ");
        while (true) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n<0){
                break;
            }
            suma = suma + n;
            con++;
        }
        int medi = suma/con;
        System.out.println("La media de los numeros es de  " + medi);
    }
}
