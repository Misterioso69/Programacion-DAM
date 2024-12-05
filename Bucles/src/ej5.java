import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int con = 0 ;
        while(true){
            int a = (int) (Math.random()*100+1);
            int b = (int) (Math.random()*100+1);
            System.out.println("Haz la suma de estos dos numeros "+a+"+"+b);
            int s = sc.nextInt();
            suma = a+b;
            if(suma == s){
                con++;
            }else {
                System.out.println("La solucion es erronea, el numero de acierto es de "+con);
                break;
            }
        }
    }
}
