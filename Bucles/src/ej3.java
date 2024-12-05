import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        int bas = (int) (Math.random()*100+1);
        Scanner sc = new Scanner(System.in);
      System.out.println("Adivina el numero random(te daremos pistas)");
      int n = sc.nextInt();
      while (bas>=1 && bas<=100){
          if (n<bas){
              System.out.println("Es mayor");
          }
          if (n>bas){
              System.out.println("Es menor");
          }
          if (bas==n){
              System.out.println("Has gando");
              break;
          }
          n = sc.nextInt();
      }
    }
}
