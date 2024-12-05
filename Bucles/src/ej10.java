public class ej10 {
    public static void main(String[] args) {
        int suma = 0 ;
        int con = 1 ;
        int i = 0;
      while(i < 10){
          if (con%2!=0) {
              suma += con;
              i++;
          }
          con++;
      }
      System.out.println("La suma de los 10 primeros numeros impares es de : "+suma);
    }
}
