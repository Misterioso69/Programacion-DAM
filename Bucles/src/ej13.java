import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = 0 ;
        int apr = 0 ;
        int m = 0;
        for (int i = 0 ; i < 6 ; i++){
            System.out.println("Introduzca una nota ");
            int n = sc.nextInt();
            if (n >= 5){
                apr ++;
            }
            if (n == 4){
                m++;
            }
            if (n<4){
                con++;
            }
        }
        System.out.println("El numero de los aprobados es de "+apr);
        System.out.println("El numero de los suspendido es de "+con);
        System.out.println("El numero de los condicionados es de "+m);
    }
}
