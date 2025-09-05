import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double BASE = 50.0;
        final double MIERCOLES = 30.0;
        final double JUEVES_PAREJA = 75.0;
        final double DESCUENTO = 0.10;

        System.out.print("Introduce el número de personas: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Introduce el día de la semana: ");
        String dia = sc.nextLine().toLowerCase();

        System.out.print("¿Tienes membresía? (s/n): ");
        String resp = sc.nextLine().toLowerCase();

        double total;

        switch (dia) {
            case "miércoles":
            case "miercoles": // aceptar sin tilde
                total = cantidad * MIERCOLES;
                break;
            case "jueves":
                int parejas = cantidad / 2;
                int extra = cantidad % 2;
                total = (parejas * JUEVES_PAREJA) + (extra * BASE);
                break;
            default:
                total = cantidad * BASE;
        }

        if (resp.equals("s")) {
            total -= total * DESCUENTO;
        }

        System.out.println("El precio total es: $" + total);

        sc.close();
    }
}
