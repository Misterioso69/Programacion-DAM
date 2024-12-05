import java.util.Scanner;

public class ej6 {
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
            int res = num % 16;
            if ( res <=9){
                mensaje += res;
            }else if (res ==10) {
                mensaje += "A" ;
            }else if (res ==11) {
                mensaje += "B" ;
            }else if (res ==12) {
                mensaje += "C" ;
            }else if (res ==13) {
                mensaje += "D" ;
            }else if (res ==14) {
                mensaje += "E" ;
            }else if (res ==15) {
                mensaje += "F" ;
            }
            num /= 16;
        }
        return mensaje;
    }
    public static void res(String mensaje) {
        int po = mensaje.length()-1;
        String resultado = "";
        for (; po >=0; po--) resultado += mensaje.charAt(po);
        System.out.println("El resultado a hexadecimal es "+resultado);
    }
}

