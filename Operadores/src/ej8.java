import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        final float may = 0.2F;
        final float ent = 0.1F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su salario");
        int sal = sc.nextInt();
        System.out.println("Ingrese los años que de trabajo");
        int ano = sc.nextInt();
        boolean res = ano>10 ? true : false;
        boolean res1 = ano<=10 && ano>=5 ? true : false;
        String mes = res? "El salario final es de "+(sal+sal*may) : res1? "El salario final es de "+(sal+sal*ent) : "El salario final es de "+sal;
        System.out.println(mes);
    }
}
