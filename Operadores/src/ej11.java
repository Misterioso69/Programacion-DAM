import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a");
        int num = sc.nextInt();
        System.out.println("Ingrese el numero b");
        int num2 = sc.nextInt();
        System.out.println("Ingrese una operacion (+,-,*,/)");
        String op = sc.next();
        boolean res = op.equals("+")? true : false;
        boolean res2 = op.equals("-")? true : false;
        boolean res3 = op.equals("*")? true : false;
        boolean res4 = op.equals("/")? true : false;
        String mes = res? "El resultado es :" + (num + num2) : res2? "El resultado es :"+ (num-num2) : res3? "El resultado es :"+ (num*num2) : res4? "El resultado es :"+ (num/num2) : "Error";
        System.out.println(mes);
    }
}
