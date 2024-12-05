import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Capi: ");
        String a = sc.nextLine();
        boolean mes = Operaciones.capi(a);
        System.out.println(mes);
        System.out.println("Primo: ");
        int b = sc.nextInt();
        boolean mes2 = Operaciones.primo(b);
        System.out.println(mes2);
        System.out.println("ProximoPrimo: ");
        int c = sc.nextInt();
        int mes3 = Operaciones.proxprimo(c);
        System.out.println(mes3);
        System.out.println("Digito: ");
        int d = sc.nextInt();
        int mes4 = Operaciones.digi(d);
        System.out.println(mes4);
        System.out.println("Voltea: ");
        String e = sc.next();
        String mes5 = Operaciones.volear(e);
        System.out.println(mes5);
        System.out.println("DigitoN: ");
        int n = sc.nextInt();
        int f = sc.nextInt();
        String mes6 = Operaciones.digitoN(n,f);
        System.out.println(mes6);
        System.out.println("Por detras : ");
        int g = sc.nextInt();
        int mes7 = Operaciones.pordetras(g);
        System.out.println(mes7);
        System.out.println("Por delante : ");
        int h = sc.nextInt();
        int mes8 = Operaciones.pordelante(h);
        System.out.println(mes8);
        System.out.println("Pegar por detras : ");
        int i = sc.nextInt();
        int n2 = sc.nextInt();
        int mes9 = Operaciones.pegarpordetras(i,n2);
        System.out.println(mes9);
        System.out.println("Pegar por delante : ");
        int j = sc.nextInt();
        int n3 = sc.nextInt();
        int mes10 = Operaciones.pegarpordelante(j,n3);
        System.out.println(mes10);
    }
}
