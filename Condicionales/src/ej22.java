import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fin = 0 ;
        float res = 0 ;
        System.out.println("Cuanto dura la llamada");
        int n = sc.nextInt();
        System.out.println("Cuando se hace la llamada, el domingo / por la mañana / por la tarde ");
        String d = sc.next();
        String ca = d.toLowerCase();
        if (n<=5){
            fin = 1*n;
        }else if (n>5 && n<=8){
            fin = (float) (n-5)*0.8+5;
        }else if (n>8 && n<10){
            fin = (float) (n-8)*0.7+5+2.4;
        }else if (n>10){
            fin = (float) ((n-10)*0.5+5+2.4+1.4);
        }
        switch (ca) {
            case "domingo":
                res = (float) (fin +(fin*0.03));
            break;
            case "maniana":
                res = (float) (fin +(fin*0.15));
            break;
            case "tarde":
                res = (float) (fin +(fin*0.1));
            break;
            default: System.out.println("El tiempo no es valido");
            break;
        }
        System.out.println("El precio de la llamada es "+res);
    }
}
