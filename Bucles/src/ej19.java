import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int po=0;
        int ne=0;
        for (int i  = 1 ; i<=10 ; i++){
            System.out.println("Pon un numero ");
            int num = sc.nextInt();
            if (num>0){
                po ++;
            }else if (num<0){
                ne++;
            }
        }
        System.out.println("La cantidad de numeros positivos son de "+po+" y los negativos "+ne);
    }
}
