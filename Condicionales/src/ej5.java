import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a hacer la media de las tres notas");
        System.out.println("Ingrese la primera ");
        float n = sc.nextFloat();
        System.out.println("Ingrese la segunda ");
        float m = sc.nextFloat();
        System.out.println("Ingrese la tercera ");
        float a = sc.nextFloat();
        float media = (n+m+a)/3;
        System.out.println("La media de las tres horas es: "+media);
        if (media<5){
            System.out.println("insuficiente");
        }else if (media>=5 && media<=5.9){
            System.out.println("suficiente");
        } else if (media>=6 && media<=6.9){
            System.out.println("bien");
        }else if (media>=7 && media<=8.9){
            System.out.println("notable");
        }else if (media>=9 && media<=10){
            System.out.println("sobresaliente");
        }else System.out.println("error");
    }
}
