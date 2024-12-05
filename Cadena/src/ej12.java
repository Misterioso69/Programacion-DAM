import java.time.LocalDate;

public class ej12 {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2020, 9, 1);
        String d = fecha.getDayOfWeek().name();
        System.out.println(d);
    }
}