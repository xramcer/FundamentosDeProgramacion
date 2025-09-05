import java.util.Scanner;

public class Ejercicio3Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cálculo de Áreas");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        System.out.println("4. Cuadrado");
        System.out.print("Elija una opción (1-4): ");
        int opcion = entrada.nextInt();

        double area = 0;

        switch (opcion) {
            case 1: // Círculo
                System.out.print("Ingrese el radio: ");
                double r = entrada.nextDouble();
                area = Math.PI * r * r;
                System.out.println("El área del círculo es: " + area);
                break;

            case 2: // Triángulo
                System.out.print("Ingrese la base: ");
                double bt = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double ht = entrada.nextDouble();
                area = (bt * ht) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;

            case 3: // Rectángulo
                System.out.print("Ingrese la base: ");
                double br = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double hr = entrada.nextDouble();
                area = br * hr;
                System.out.println("El área del rectángulo es: " + area);
                break;

            case 4: // Cuadrado
                System.out.print("Ingrese el lado: ");
                double lado = entrada.nextDouble();
                area = lado * lado;
                System.out.println("El área del cuadrado es: " + area);
                break;

            default:
                System.out.println("Opción inválida, debe ser entre 1 y 4.");
        }

        entrada.close();
    }
}
