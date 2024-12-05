import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia es de lunes a viernes : ");
        String dia = sc.nextLine();
        String min = dia.toLowerCase();
        System.out.println("Que hora es ?");
        int hora = sc.nextInt();
        System.out.println("Que minutos es ?");
        int minuto = sc.nextInt();
        int res ;
        if (hora<=24 && minuto<=60) {
            switch (min) {
                case "lunes":
                    res = (((24*4)*60)+(15-hora)*60)-(minuto);
                    System.out.println("Los minutos que faltan son : "+res);
                    break;
                case "martes":
                    res = (((24 * 3) * 60) + (15 - hora) * 60) - (minuto);
                    System.out.println("Los minutos que faltan son : "+res);
                    break;
                case "miercoles":
                    res = (((24 * 2) * 60) + (15 - hora) * 60) - (minuto);
                    System.out.println("Los minutos que faltan son : "+res);
                    break;
                case "jueves":
                    res = (((24 * 1) * 60) + (15 - hora) * 60) - (minuto);
                    System.out.println("Los minutos que faltan son : "+res);
                    break;
                case "viernes":
                    if (hora<15){
                        res = (  (15 - hora) * 60) - (minuto);
                        System.out.println("Los minutos que faltan son : "+res);
                    }else {
                        System.out.println("Ya es fin de semana");
                    }
                    break;
                default: System.out.println("Opcion no valida");
                    break;
            }
        } else {
            System.out.println("Error en la hora o en los minutos");
        }

    }
}
