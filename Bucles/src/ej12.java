import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = 0 ;
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Introduzca una nota ");
            int n = sc.nextInt();
            if (n<5){
                con++;
            }
        }
        System.out.println("El numero de los suspendido es de "+con);
    }
}
