import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        final float preciofinalkg =  (float) 2.95 ;
        float fin = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos kilos son ?");
        int k = sc.nextInt();
        System.out.println("Que tipo de uva es (A/B)");
        String tipo = sc.next();
        String ca = tipo.toUpperCase();
        System.out.println("Que tamaño tiene (1/2)");
        int tam = sc.nextInt();
        switch (ca) {
            case "A": if (tam==1){
                fin  = (float) (k*(preciofinalkg+0.2));
            }else if (tam==2){
                fin = (float) (k*(preciofinalkg+0.3));
            } else {
                System.out.println("El tamaño inadecuado");
            }
            System.out.println("El precio final es : " +fin);
            break;
            case "B": if (tam==1){
                fin = (float) (k*(preciofinalkg-0.3));
            } else if (tam==2){
                fin = (float) (k*(preciofinalkg-0.5));
            } else {
                System.out.println("El tamaño inadecuado");
            }
                System.out.println("El precio final es : " +fin);
            break;
            default: System.out.println("Tipo inadecuado");
            break;
        }
    }
}
