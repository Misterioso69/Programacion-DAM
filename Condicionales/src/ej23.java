import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0 ;
        System.out.println("Cuanto pesa tu paquete");
        double k = sc.nextDouble();
        System.out.println("A donde va dirigido tu paquete ( America del Norte = 1 /America Central = 2 /America del Sur =3 /Europa =4 /Asia = 5 )");
        int p = sc.nextInt();
        if (k>5){
            System.out.println("Peso no valido ");
        }else{
            switch (p){
                case 1: res = k*24;
                break;
                case 2: res = k*20;
                break;
                case 3: res = k*21;
                break;
                case 4: res = k*10;
                break;
                case 5: res = k*18;
                break;
                default: System.out.println("Opcion no valida ");
                break;
            }
            System.out.println("El precio final es de "+res);
        }
    }
}
