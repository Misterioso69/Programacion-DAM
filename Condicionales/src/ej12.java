import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        System.out.println("Dime un caracter");
        Scanner sc = new Scanner(System.in);
        char ca = sc.next().charAt(0);
        System.out.println("Hacia a donde apunta tu piramide");
        String di = sc.next();
        String c = di.toLowerCase();
        switch (c) {
            case "arriba":
                System.out.println("     "+ca);
                System.out.println("    "+ca+" "+ca);
                System.out.println("   "+ca+" "+ca+" "+ca);
                System.out.println("  "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca+" "+ca);
                break;
            case "abajo":
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println("  "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println("   "+ca+" "+ca+" "+ca);
                System.out.println("    "+ca+" "+ca);
                System.out.println("     "+ca);
                break;
            case "izquierda":
                System.out.println("         "+ca);
                System.out.println("       "+ca+" "+ca);
                System.out.println("     "+ca+" "+ca+" "+ca);
                System.out.println("   "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println("   "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println("     "+ca+" "+ca+" "+ca);
                System.out.println("       "+ca+" "+ca);
                System.out.println("         "+ca);
                break;
            case "derecha":
                System.out.println(" "+ca);
                System.out.println(" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca+" "+ca);
                System.out.println(" "+ca+" "+ca);
                System.out.println(" "+ca);
                break;
            default :
                System.out.println("Opcion no valida");
                break;
        }

    }
}