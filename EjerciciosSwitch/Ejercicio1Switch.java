import java.util.Scanner;

public class Ejercicio1Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1 - 12): ");
        int numeroMes = sc.nextInt();

        String mesNombre;
        int totalDias;

        if (numeroMes >= 1 && numeroMes <= 12) {
            switch (numeroMes) {
                case 1:  mesNombre = "Enero";      totalDias = 31; break;
                case 2:  mesNombre = "Febrero";    totalDias = 28; break;
                case 3:  mesNombre = "Marzo";      totalDias = 31; break;
                case 4:  mesNombre = "Abril";      totalDias = 30; break;
                case 5:  mesNombre = "Mayo";       totalDias = 31; break;
                case 6:  mesNombre = "Junio";      totalDias = 30; break;
                case 7:  mesNombre = "Julio";      totalDias = 31; break;
                case 8:  mesNombre = "Agosto";     totalDias = 31; break;
                case 9:  mesNombre = "Septiembre"; totalDias = 30; break;
                case 10: mesNombre = "Octubre";    totalDias = 31; break;
                case 11: mesNombre = "Noviembre";  totalDias = 30; break;
                case 12: mesNombre = "Diciembre";  totalDias = 31; break;
                default: mesNombre = ""; totalDias = 0;
            }

            System.out.println("El mes seleccionado es: " + mesNombre);
            System.out.println("Tiene " + totalDias + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }

        sc.close();
    }
}
