import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = sc.nextInt();
        String bina = "";
        if (num == 0 ) System.out.println("El numero es cero y en binario tambien : 0");
        while (num > 0) {  //Creo un bucle que funcione hasta que el numero introducido es 0 o menor
            int res = num % 2; //Haces el modulo del numero entre dos para poeder pasarlo a binario
            bina += res; //Le sumamos los numeos a una cadena llamada "bina"
            num = num / 2; //Aqui lo que hacemos es divir el numero entre dos para llavarnos el coeficiente de la divion y volver a hacer el bucle
        }
        int i = bina.length() - 1; //Calculamos la posicion del ultimo numero que es igual a la longuitud menos uno
        String men = "";
        for ( ; i >= 0; i--) men += bina.charAt(i); //En este bucle lo que se hace es darle la vuelta a la cadena "bina" y la escribimos en la de "men"
        System.out.println(men);
    }
}
