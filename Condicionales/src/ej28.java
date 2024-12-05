import java.util.Scanner;

public class ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos hombres hay");
        double n = sc.nextInt();
        System.out.println("Cuantas mujeres hay");
        double m = sc.nextInt();
        double total = n+m;
        double res = (n/total)*100;
        double res1 = (m/total)*100;
        System.out.println("El porcentaje de los hombres hay es: "+(int)res+" y de mujres "+(int)res1+" el total de ambos son "+(int)total);
    }
}
