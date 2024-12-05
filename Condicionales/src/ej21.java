import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fin = 0 ;
        int bus = 0 ;
        System.out.println("Cuantos alumnos van ");
        int n = sc.nextInt();
        if (n>100){
            fin = 65 ;
            bus = fin*n;
        } else if (n>=50 && n<=99) {
            fin = 70;
            bus = fin*n;
        }else if (n>=30 && n<=49) {
            fin = 95;
            bus = fin*n;
        }else if (n<30) {
            bus = 4000 ;
            fin = bus/n ;
        }
        System.out.println("El precio final de cada alumno es de : " + fin+" y el des bus es de : "+bus);
    }
}
