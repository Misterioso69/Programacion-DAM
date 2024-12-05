public class ej10 {
    public static void main(String[] args) {
        System.out.println("Tirada del primer jugador: ");
        int a = (int)(Math.random()*6+1);
        System.out.println(a);
        System.out.println("Tirada del segundo jugador: ");
        int b = (int)(Math.random()*6+1);
        System.out.println(b);
        System.out.println("Tirada del tercer jugador: ");
        int c = (int)(Math.random()*6+1);
        System.out.println(c);
        int res = Math.max(a,b);
        int mes =Math.max(res,c);
        System.out.println("El mayor es: "+mes);
        int res1 = Math.min(a,b);
        int mes1 = Math.min(res1,c);
        System.out.println("El menor es: "+mes1);


    }
}
