import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ej5 {
    public static void main(String[] args) {
        Period p = Period.between(LocalDate.of(2001,10,7),LocalDate.of(2004,5,10));
        long dia = ChronoUnit.DAYS.between(LocalDate.of(2001,10,7),LocalDate.of(2004,5,10));
        System.out.println(dia);
    }
}
