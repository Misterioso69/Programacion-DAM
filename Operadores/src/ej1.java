import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SI="si";
        final String NO ="no";
        int ed;
        String entr;
        System.out.println("Cuantos años tienes");
        ed=sc.nextInt();
        System.out.println("Tienes la entrada comprada");
        entr=sc.next();
        boolean resul = ed>=18 && entr.equals(SI)? true : false;
        String mensaje = resul? "Puedes pasar" : "No puedes pasar";
        System.out.println(mensaje);

   }
}
