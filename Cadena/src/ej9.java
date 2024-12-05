public class ej9 {
    public static void main(String[] args) {
        double a = Math.random();
        System.out.println("El numero que salio es: "+a);
        boolean res = a>=0.5 ? true : false;
        String mes = res? "El numero esta mas cerca del 1 " : "El numero esta mas cerca del 0 ";
        System.out.println(mes);

    }
}
