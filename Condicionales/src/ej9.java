import java.time.LocalTime;
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        LocalTime d = LocalTime.now();
        System.out.println("la hora es "+d);
        int h = 23- d.getHour();
        int m = 60- d.getMinute();
        int s = 60- d.getSecond();
        System.out.println("Para que sea medianoche faltan "+h+" horas y "+m+" minutos" );
        System.out.println("Y en segundos es "+((h*3600)+(m*60)+s) );

        System.out.println("De otra forma bien hecha ");
        System.out.println("Dime la hora ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        System.out.println("Dime los minutos ");
        int minutos = sc.nextInt();
        if (hora<24){
            System.out.println("Los segundos que quedan hasta la medianoche "+(((23-hora)*3600)+((59-m)*60)));
        }else{
            System.out.println("Hora no valida");
        }
    }
}
