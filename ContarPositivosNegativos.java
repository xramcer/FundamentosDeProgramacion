import java.util.Scanner;

public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C, CA, CP, CN, NU;

        CP = 0; 
        CN = 0; 

        System.out.print("Ingrese el número de cantidades a evaluar: ");
        NU = sc.nextInt();

        C = 1;
        do {
            System.out.print("Ingrese la cantidad " + C + ": ");
            CA = sc.nextInt();

            if (CA > 0) {
                CP = CP + 1;
            } else {
                CN = CN + 1;
            }

            C = C + 1;
        } while (C <= NU);

        System.out.println("Cantidad de números positivos: " + CP);
        System.out.println("Cantidad de números menores o iguales a cero: " + CN);

        sc.close();
    }
}