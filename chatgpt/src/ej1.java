import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        ran();
    }

    public static void ran() {
        // Inicializamos el resultado con asteriscos
        String res = "****";

        // Generamos cuatro números aleatorios entre 1 y 9
        int num1 = (int) (Math.random() * 9 + 1);
        int num2 = (int) (Math.random() * 9 + 1);
        int num3 = (int) (Math.random() * 9 + 1);
        int num4 = (int) (Math.random() * 9 + 1);

        System.out.println("Los números aleatorios generados son: " + num1 + " " + num2 + " " + num3 + " " + num4);

        Scanner sc = new Scanner(System.in);

        // Convertimos el resultado en un StringBuilder para modificarlo fácilmente
        StringBuilder resultadoParcial = new StringBuilder(res);

        while (true) {
            System.out.println("Escribe cuatro números:");
            String men = sc.nextLine();

            // Verificamos que el usuario ha introducido cuatro dígitos
            if (men.length() != 4) {
                System.out.println("Por favor, ingresa exactamente cuatro dígitos.");
                continue;
            }

            // Bandera para verificar si el usuario ha ganado
            boolean aciertoTotal = true;

            // Revisamos cada dígito ingresado por el usuario
            if (men.charAt(0) - '0' == num1) {
                resultadoParcial.setCharAt(0, men.charAt(0));
            } else {
                aciertoTotal = false;
            }
            if (men.charAt(1) - '0' == num2) {
                resultadoParcial.setCharAt(1, men.charAt(1));
            } else {
                aciertoTotal = false;
            }
            if (men.charAt(2) - '0' == num3) {
                resultadoParcial.setCharAt(2, men.charAt(2));
            } else {
                aciertoTotal = false;
            }
            if (men.charAt(3) - '0' == num4) {
                resultadoParcial.setCharAt(3, men.charAt(3));
            } else {
                aciertoTotal = false;
            }

            // Mostramos el progreso del usuario
            System.out.println("Progreso: " + resultadoParcial);

            // Si el usuario ha acertado todos los números, gana
            if (aciertoTotal) {
                System.out.println("¡Has ganado!");
                break;
            }
        }

        sc.close();
    }
}
