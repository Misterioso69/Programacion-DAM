import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double des = 0.08 ;
        final double des1 = 0.1 ;
        double res = 0 ;
        System.out.println("Cuantos productos son ");
        int n = sc.nextInt();
        System.out.println("Ingrese el precio del producto: por unidad");
        double precio = sc.nextDouble();
        double sum = n * precio ;
        if (sum<50){
            res = sum-sum*des;
        }else {
            res = sum-sum*des1;
        }
        System.out.println("El precio final es de "+(int) res);
    }
}
