import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos años tienes : ");
        int n = sc.nextInt();
        boolean res = n<5? true : false;
        boolean res2 = n>=5 && n<=12 ? true : false;
        boolean res3 = n>=13 && n<=17 ? true : false;
        String mes = res? "Eres un infante" : res2? "Eres un niño" : res3? "Eres un adolescente" : "Eres un adulto ";
        System.out.println(mes);
    }
}
