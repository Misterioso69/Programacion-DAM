import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tema eliges ? Refran, frase celebre, cancion, comida ");
        String tema = sc.nextLine().toLowerCase();
        String fraseclave = "";
        String muestra = "";
        int per = 0 ;
        boolean ganador = false;
        int dinero = 0;
        switch (tema) {
            case "refran":
                fraseclave = "a caballo regalado no le mires el diente";
                muestra = "* ******* ******** ** ** ***** ** ******";
                break;
            case "frase celebre":
                fraseclave = "la peor lucha es la que no se hace";
                muestra= "** **** ***** ** ** *** ** ** ****";
                break;
            case "cancion":
                fraseclave = "sus soldados son flores de madera";
                muestra = "*** ******** *** ****** ** ******";
                break;
            case "comida":
                fraseclave = "salmon a la plancha con arroz";
                muestra = "****** * ** ******* *** *****";
            break;
            default:System.out.println("Opcion no valida ");
            break;
        }
       while (!ganador) {
           System.out.println("Tu frase a adivinar es : "+muestra);
           int ran = (int)(Math.random()*175+25);
           int cont = 0 ;
           System.out.println("Que leta eliges por "+ran+"€");
           String solucion = sc.nextLine().toLowerCase();
           if (solucion=="-1") break;
           if (per == 10) break;
           if (solucion.equals(fraseclave)) {
               ganador = true;
           }else {
               for (int i = 0; i <= fraseclave.length()-1; i++) {
                   if (fraseclave.charAt(i) == solucion.charAt(0)) {
                       String com = "";
                       String bo = "";
                       for (int j = 0; j <i; j++) {
                           com += muestra.charAt(j);
                       }
                       for (int j = i+1; j<=muestra.length()-1 ; j++) {
                           bo += muestra.charAt(j);
                       }
                       muestra = com + solucion+bo;
                       cont++ ;
                   }
               }
           }
            dinero += (cont*ran);
           System.out.println("Dinero acumulado: "+dinero+"€");
       }
       if(ganador){
           System.out.println("Has ganado");
           System.out.println("Y el dinero ganaso es "+dinero);
       } else {
           System.out.println("No hay ganado");
       }
    }
}
