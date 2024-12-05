import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) throws Exception {
        int a = -3;
        while (a<3){
            try {
                imprimePositivo(a);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                a++;
            }
        }
        System.out.println();
         a = -3;
        while (a<3){
            try {
                imprimeNegativo(a);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                a++;
            }
        }
    }
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Error: El valor debe ser positivo.");
        }
        System.out.println("Valor positivo: " + p);
    }
    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Error: El valor debe ser negativo.");
        }
        System.out.println("Valor negativo: " + n);
    }
}
