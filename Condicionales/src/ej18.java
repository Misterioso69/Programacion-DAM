import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera posicion de la primera circusferencia (x1): ");
        int x1 = sc.nextInt();
        System.out.println("Ingrese la segunds posicion de la primera circusferencia (y1): ");
        int y1 = sc.nextInt();
        System.out.println("Ingrese el radio de la primera circusferencia (r1): ");
        int r1 = sc.nextInt();
        System.out.println("Ingrese la primera posicion de la segunda circusferencia (x2): ");
        int x2 = sc.nextInt();
        System.out.println("Ingrese la segunds posicion de la segunda circusferencia (y2): ");
        int y2 = sc.nextInt();
        System.out.println("Ingrese el radio de la segunda circusferencia (r2): ");
        int r2 = sc.nextInt();
        double dista = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sol1 = r1+r2;
        double sol2 = Math.abs(r1-r2);
        double sol3 = r2-r1;
        if (dista>sol1){
            System.out.println("Son circusferencia exteriosres ");
        }else if (dista==sol1){
            System.out.println("Son circusferencia tangentes exteriosres ");
        }else if (dista<sol1&&dista>sol2){
            System.out.println("Son circusferencia secantes ");
        }else if (dista>0&&dista<sol2){
            System.out.println("Son circusferencia interiores ");
        }else if (dista==sol3){
            System.out.println("Son circusferencia tangentes interiores ");
        } else if (dista ==0) {
            System.out.println("Son circusferencia concentricas");
        }else {
            System.out.println("Error");
        }
    }
}
