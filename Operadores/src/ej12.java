import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nota");
        int nota = sc.nextInt();
        boolean res = nota>=90? true : false;
        boolean res2 = nota>=80 && nota<=89? true : false;
        boolean res3 = nota>=70 && nota<=79? true : false;
        boolean res4 = nota>=60 && nota<=69? true : false;
        String mes = res? "A" : res2? "B" : res3? "C" : res4? "D" : "F" ;
        System.out.println(mes);
    }
}
