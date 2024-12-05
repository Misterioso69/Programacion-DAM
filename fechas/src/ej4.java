import java.time.LocalDate;

public class ej4 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2010, 2,20);
        LocalDate dia = fecha.plusDays(30);
        System.out.println(dia);
    }
}
