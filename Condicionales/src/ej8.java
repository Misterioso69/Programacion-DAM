import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu mes de nacimiento");
        String mes = sc.nextLine();
        System.out.println("Dime tu dia de nacimiento");
        int d = sc.nextInt();
        String ca = mes.toLowerCase();
        if (d>=1 && d<=31){
            switch (ca) {
                case "enero":
                    if (d <= 20) {
                        System.out.println("Capricornio");
                    } else {
                        System.out.println("Acuario");
                    }
                    break;
                case "febrero":
                    if (d <= 19 ) {
                        System.out.println("Acuario");
                    } else if (d<=29){
                        System.out.println("Picis");
                    }else System.out.println("Opcion no valida");
                    break;
                case "marzo":
                    if (d <= 20) {
                        System.out.println("Picis");
                    } else {
                        System.out.println("Aries");
                    }
                    break;
                case "abril":
                    if (d <= 20) {
                        System.out.println("Aries");
                    } else {
                        System.out.println("Tauro");
                    }
                    break;
                case "mayo":
                    if (d < 20) {
                        System.out.println("Tauro");
                    } else {
                        System.out.println("Geminis");
                    }
                    break;
                case "junio":
                    if (d <= 21) {
                        System.out.println("Geminis");
                    } else {
                        System.out.println("Cancer");
                    }
                    break;
                case "julio":
                    if (d <= 22) {
                        System.out.println("Cancer");
                    } else {
                        System.out.println("Leo");
                    }
                    break;
                case "agosto":
                    if (d <= 23) {
                        System.out.println("Leo");
                    } else {
                        System.out.println("Virgo");
                    }
                    break;
                case "septiembre":
                    if (d <= 22) {
                        System.out.println("Virgo");
                    } else {
                        System.out.println("Libra");
                    }
                    break;
                case "octubre":
                    if (d <= 22) {
                        System.out.println("Libra");
                    } else {
                        System.out.println("Escorpio");
                    }
                    break;
                case "noviembre":
                    if (d <= 22) {
                        System.out.println("Escorpio");
                    } else {
                        System.out.println("Sagitario");
                    }
                    break;
                case "diciembre":
                    if (d <= 21) {
                        System.out.println("Sagitario");
                    } else {
                        System.out.println("Capricornio");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }else System.out.println("Opcion no valida");
    }
}