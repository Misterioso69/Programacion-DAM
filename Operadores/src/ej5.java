import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero ");
        int num = sc.nextInt();
        boolean res= (num%2)==0&&(num%3)==0? true : false;
        boolean res3 = (((num%2)==0) && !((num%3)==0))? true : false;
        String men = res? "ES es multipo de 2 y 3" : res3 ? "Multiplo de 2 " : "Multiplo de 3";
        System.out.println(men);

    }
}
