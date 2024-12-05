import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String men = "";
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        men = oct(num,men);
        res(men);
    }
    public static String oct(int num, String mensaje) {
        while (num != 0) {
            int res = num % 8;
            mensaje += res;
            num /= 8;
        }
        return mensaje;
    }
    public static void res(String mensaje) {
        int po = mensaje.length()-1;
        String resultado = "";
        for (; po >=0; po--) resultado += mensaje.charAt(po);
        System.out.println("El resultado a octal es "+resultado);
    }
}
