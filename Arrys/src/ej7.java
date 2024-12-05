import java.util.Arrays;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[100];
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*20);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Di el numero el que quieres remplazar");
        int num = sc.nextInt();
        System.out.println("Que numero vas a poner en vez ");
        int num2 = sc.nextInt();
        String [] b = new String [100];
        for(int i = 0; i < a.length; i++){
            if(a[i] == num){
                b[i] = "\""+String.valueOf(num2)+"\"";
            }else {
                b[i] = String.valueOf(a[i]);
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
