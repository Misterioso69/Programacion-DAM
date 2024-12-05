import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ej8 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        Locale es = new Locale("es", "ES");
        System.out.println( hoy.getMonth().getDisplayName(TextStyle.FULL,es));
    }
}
