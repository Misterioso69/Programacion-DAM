public class ej4 {
    public static void main(String[] args) {
        int [] numeros = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100+1);
            cuadrado[i] = (int) Math.pow(numeros[i],2);
            cubo[i] = (int) Math.pow(numeros[i],3);
        }
       for (int i = 0; i < cuadrado.length; i++) {
           System.out.println(numeros[i]+"|"+cuadrado[i]+"|"+cubo[i]);
       }
    }
}
