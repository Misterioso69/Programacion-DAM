import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int suma1 =0 ;
        int suma2 =0 ;
        for (int i = num; i >=1; i--) { //aqui vemos todos los divisores del "num" y se la sumamos a una variable "suma1"
            if (num%i==0 && i!=num){
                suma1 += i;  //sumamos los divisores de "num" y a el mismo
            }
        }
        for (int i = num2; i >=1; i--) { //aqui vemos todos los divisores del "num2" y se la sumamos a una variable "suma2"
            if (num2%i==0 && i!=num2){
                suma2 += i; //sumamos los divisores de "num2" y a el mismo
            }
        }
        if (num==suma2 && num2==suma1){ //comparamos si las variables de antes son iguales a los numeros introducidos
            System.out.println("Son numeros amigos ");
        }else {
            System.out.println("No son numeros amigos");
        }
    }
}
