import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        boolean res = n>0? true : false ;
        boolean res1 = n<0? true : false ;
        String m =res? "Es positivo" : res1? "Es negativo" : "Es cero";
        System.out.println(m);
    }
}
