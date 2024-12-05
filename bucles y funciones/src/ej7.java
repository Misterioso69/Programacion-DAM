import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int res = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que area quieres calcular ? Triangulo,Cuadrado,Circulo: ");
        String area = sc.nextLine().toLowerCase();
        switch (area) {
            case "triangulo": res =triangulo(); break;
            case "cuadrado": res=cuadrado(); break;
            case "circulo": res= circulo(); break;
        }
        System.out.println(res);
    }
    public static int triangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di la base del triangulo es: ");
        int base = sc.nextInt();
        System.out.println("Di la altura del triangulo es: ");
        int altura = sc.nextInt();
        return (base*altura)/2;
    }
    public static int cuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di la base del cuadrado es: ");
        int base = sc.nextInt();
        return (base*base);
    }
    public static int circulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Di el radio del circulo es: ");
        int radio = sc.nextInt();
        return (radio*radio)/2;
    }
}
