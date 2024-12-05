import java.time.LocalDate;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu año ");
        int ano =sc.nextInt();
        System.out.println("Dime ti dia");
        int dia =sc.nextInt();
        System.out.println("Dime tu mes");
        int mes =sc.nextInt();
        LocalDate fecha = LocalDate.of(ano,mes,dia);
        String d = fecha.getDayOfWeek().name();
        System.out.println(d);
    }
}
