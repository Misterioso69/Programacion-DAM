import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = 0 ;
        double res = 0 ;
        System.out.println("Escribe un numero binario");
        String bin = sc.nextLine();
        for (int i = bin.length()-1; i >= 0; i--) { //En este bucle pillamos la "i" como la posicion de la cadena para poder ir operando dependiendo de que en posicion este
          if (bin.charAt(i) == '1') { //Si en la posicion el numero que hay es 1 entra
              res += Math.pow(2, con); //Aqui lo que hacemos es elevar el numero a "con"
          }
            con++; //Le vamos sumando uno para que el elevado vaya cambiando
        }
        System.out.println("El numero idicado en decimal es " +(int) res);
    }
}
