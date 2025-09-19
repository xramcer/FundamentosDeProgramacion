package EjerciciosArreglos;

import java.util.Scanner;

public class RegistroEstudiantesTabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        if (n <= 0) {
            System.out.println("Cantidad inválida.");
            sc.close();
            return;
        }

        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] promedios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Edad: ");
            edades[i] = sc.nextInt();
            System.out.print("Promedio (ej. 8.5): ");
            promedios[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\n=== TABLA DE ESTUDIANTES ===");
        System.out.printf("%-4s %-25s %-6s %-8s%n", "No.", "Nombre", "Edad", "Promedio");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-25s %-6d %-8.2f%n", (i + 1), nombres[i], edades[i], promedios[i]);
        }

        sc.close();
    }
}
