import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas horas trabajadas");
        int horas = sc.nextInt();
        if (horas <= 40){
            int res = horas * 12;
            System.out.println("Tu salario es de "+res+"€");
        }else {
            int ex = horas - 40;
            int hora = horas -ex ;
            int res = hora * 12 + ex *16;
            System.out.println("Tu salario es de "+res+"€ tus horas extras son de "+ex);
        }
    }
}
