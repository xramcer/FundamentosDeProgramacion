import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad <= 65) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }

        sc.close();
    }
}