import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la velocidad: ");
        int vel = sc.nextInt();
        sc.nextLine(); 

        System.out.print("¿Es tu cumpleaños? (si/no): ");
        String cumple = sc.nextLine().toLowerCase();

        if (cumple.equals("si")) {
            System.out.println("No tienes multa.");
        } else {
            if (vel < 60) {
                System.out.println("No tienes multa.");
            } else if (vel <= 80) {
                System.out.println("Tienes una multa pequeña.");
            } else {
                System.out.println("Tienes una multa grande.");
            }
        }

        sc.close();
    }
}