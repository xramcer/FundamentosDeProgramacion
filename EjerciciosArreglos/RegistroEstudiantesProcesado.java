package EjerciciosArreglos;

import java.util.Scanner;

public class RegistroEstudiantesProcesado {
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

        String[] estudiantes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = sc.nextLine();
        }

        System.out.println("\n=== LISTADO PROCESADO ===");
        for (int i = 0; i < estudiantes.length; i++) {
            String nombre = estudiantes[i];
            int largo = nombre.length();

            String transformado;
            if (nombre.equals(nombre.toLowerCase())) {
                transformado = nombre.toUpperCase();
            } else {
                transformado = nombre.toLowerCase();
            }

            System.out.println((i + 1) + ". Original: \"" + nombre + "\" | Caracteres: " + largo +
                               " | Transformado: \"" + transformado + "\"");
        }

        sc.close();
    }
}
