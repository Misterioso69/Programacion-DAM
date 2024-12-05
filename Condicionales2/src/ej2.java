import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el DNI sin la letra");
        int num = sc.nextInt();
        String dnil = "TRWAGMYFPDXBNJZSQVHLCKE" ;
        if (  num<=99999999){
            int letra = num%23;
            char letra2 = dnil.charAt(letra);
            System.out.println("Su DNI es: "+num+letra2);
        } else {
            System.out.println("El DNI no valido");
        }

    }
}
