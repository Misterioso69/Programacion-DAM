import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        int con = 0 ;
        for (int i =1 ; i<=10 ; i++){
            System.out.println("Introduzca un numero");
            int num = sc.nextInt();
            sum = sum + num ;
            con++;
        }
        int media = sum/con;
        System.out.println("La media de los numeros es "+media);
    }
}
