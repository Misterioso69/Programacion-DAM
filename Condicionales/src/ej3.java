import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 7 para representar el dia");
        int n1 = sc.nextInt();
        switch (n1){
            case 1 : System.out.println("Lunes");
            break;
            case 2 : System.out.println("Martes");
            break;
            case 3 : System.out.println("Miercoles");
            break;
            case 4 : System.out.println("Jueves");
            break;
            case 5 : System.out.println("Viernes");
            break;
            case 6 : System.out.println("Sabado");
            break;
            case 7 : System.out.println("Domingo");
            break;
            default : System.out.println("El numero no es valido");
            break;
        }
    }
}
