import java.time.LocalDate;

public class ej6 {
    public static void main(String[] args) {
        LocalDate p = LocalDate.now();
        LocalDate d = p.plusDays(-3);
        String s = d.getDayOfWeek().name();
        System.out.println(s);
    }
}
