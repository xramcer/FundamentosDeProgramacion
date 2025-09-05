import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora (0 - 23): ");
        int h = sc.nextInt();

        if (h < 0 || h > 23) {
            System.out.println("La hora debe estar entre 0 y 23.");
        } else {
            String saludo;

            if (h >= 6 && h <= 12) {
                saludo = "¡Buenos días!";
            } else if (h >= 13 && h <= 20) {
                saludo = "¡Buenas tardes!";
            } else {
                saludo = "¡Buenas noches!";
            }

            System.out.println(saludo);
        }

        sc.close();
    }
}
