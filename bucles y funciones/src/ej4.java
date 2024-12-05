import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Introduce un numero ");
        int num = sc.nextInt();
        System.out.println("Introduce otro numero ");
        int num2 = sc.nextInt();
        System.out.println("Que operacion quieres hacer");
        char ope = sc.next().charAt(0);
        switch (ope) {
            case '+': resultado = operadores.sum(num, num2);
            break;
            case '-': resultado = operadores.res(num, num2);
            break;
            case '*': resultado = operadores.mul(num, num2);
            break;
            case '/': resultado = operadores.div(num, num2);
            break;
            default:System.out.println("Operacion Invalida");
            break;
        }
        System.out.println(resultado);
    }
}