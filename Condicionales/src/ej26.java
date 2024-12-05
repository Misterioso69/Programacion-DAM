import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que temperatura hace");
        int n = sc.nextInt();
        if (n<=10){
            System.out.println("Hace frio");
        }else if (n>10 && n<=20){
            System.out.println("Esta Nublado");
        }else if (n>20 && n<=30){
            System.out.println("Es un dia caluroso");
        }else if (n>30){
            System.out.println("Es un dia tropical");
        }
    }
}
