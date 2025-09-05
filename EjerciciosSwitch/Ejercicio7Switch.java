import java.util.Scanner;

public class Ejercicio7Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;

        System.out.println("¿De qué sabor quieres la tarta?");
        System.out.println("- manzana");
        System.out.println("- fresa");
        System.out.println("- chocolate");
        System.out.print("Elige un sabor: ");
        String sabor = sc.nextLine().toLowerCase();

        switch (sabor) {
            case "manzana":
                precio = 200;
                break;
            case "fresa":
                precio = 250;
                break;
            case "chocolate":
                System.out.print("¿Quieres chocolate negro o blanco?: ");
                String tipo = sc.nextLine().toLowerCase();
                if (tipo.equals("negro")) {
                    precio = 280;
                } else if (tipo.equals("blanco")) {
                    precio = 300;
                } else {
                    System.out.println("Opción inválida, se asignará chocolate negro por defecto.");
                    precio = 280;
                }
                break;
            default:
                System.out.println("Sabor inválido, se asignará tarta de manzana por defecto.");
                precio = 200;
        }

        System.out.print("¿Deseas agregar snacks? (s/n): ");
        String snacks = sc.nextLine().toLowerCase();
        if (snacks.equals("s")) {
            System.out.print("¿Cuántos snacks deseas añadir?: ");
            int cantidadSnacks = sc.nextInt();
            precio += cantidadSnacks * 25;
            sc.nextLine(); // limpiar buffer
        }

        System.out.print("¿Quieres personalizar la tarta con un nombre? (s/n): ");
        String personalizar = sc.nextLine().toLowerCase();
        if (personalizar.equals("s")) {
            System.out.print("Escribe el nombre para la tarta: ");
            String nombre = sc.nextLine();
            precio += 30;
        }

        System.out.println("El precio total de tu tarta es: $" + precio);

        sc.close();
    }
}
