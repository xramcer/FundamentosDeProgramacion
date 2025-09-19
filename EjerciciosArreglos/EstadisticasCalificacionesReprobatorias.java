package EjerciciosArreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticasCalificacionesReprobatorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones vas a capturar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número de calificaciones inválido.");
            sc.close();
            return;
        }

        double[] calificaciones = new double[n];
        System.out.println("Ingresa las calificaciones (pueden tener decimales):");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        double suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];
        ArrayList<Integer> indicesReprobados = new ArrayList<>();
        ArrayList<Double> califsReprobadas = new ArrayList<>();

        for (int i = 0; i < calificaciones.length; i++) {
            double c = calificaciones[i];
            suma += c;
            if (c > max) max = c;
            if (c < min) min = c;
            if (c < 7.0) {
                indicesReprobados.add(i);
                califsReprobadas.add(c);
            }
        }

        double promedio = suma / calificaciones.length;

        System.out.println("\n=== RESULTADO ===");
        System.out.print("Calificaciones: ");
        for (double c : calificaciones) System.out.print(c + "  ");
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        if (indicesReprobados.size() == 0) {
            System.out.println("No hay calificaciones reprobatorias (todas >= 7).");
        } else {
            System.out.println("Hay " + indicesReprobados.size() + " calificación(es) reprobatoria(s):");
            for (int i = 0; i < indicesReprobados.size(); i++) {
                System.out.println(" - Índice " + (indicesReprobados.get(i) + 1) +
                                   ", calificación: " + califsReprobadas.get(i));
            }
        }

        sc.close();
    }
}
