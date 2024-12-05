import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia es :");
        String dia = sc.next();
        System.out.println("Que hora es : (9/15) ");
        int hora = sc.nextInt();
        boolean res =  (hora>=9 && hora<=15) && (!dia.equals("domingo") && !dia.equals("sabado")) ? true : false;
        String mes = res ? "Esta trab" : "Esta desc";
        System.out.println(mes);
    }
}
