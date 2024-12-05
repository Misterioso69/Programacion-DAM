import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un día de la semana");
        String in=sc.next();
        String dia = in.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.println("Asignatura programación");
                break;
            case "martes":
                System.out.println("Asignatura sistema informatico");
                break;
            case "miercoles":
                System.out.println("Asignatura sostenibilidad");
                break;
            case "jueves":
                System.out.println("Asignatura fol");
                break;
            case "viernes":
                System.out.println("Asignatura base de datos");
                break;
            default:
                System.out.println("Es fin de semana");
                break;
        }
    }
}
