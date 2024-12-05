public class ej6 {
    public static void main(String[] args) {
        int sum;
        System.out.println("Tirada de tres dados: ");
        int a = (int)(Math.random()*10);
        System.out.println(a);
        System.out.println("Tirada de tres dados: ");
         int b = (int)(Math.random()*10);
        System.out.println(b);
        System.out.println("Tirada de tres dados: ");
        int c = (int)(Math.random()*10);
        System.out.println(c);
        sum = a + b + c;
        System.out.println("La suma de los tres es: "+sum);
    }
}
