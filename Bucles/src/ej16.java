import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la clave de la caja");
        for (int i = 4 ; i>=0; i--){
            String m = sc.nextLine();
            if (m.equals("1234")){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
            System.out.println("Te quedan "+(i)+" intentos");
        }

    }
}
