import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de x: ");
        int x = sc.nextInt();

        System.out.print("Ingresa el valor de y: ");
        int y = sc.nextInt();

        System.out.print("Ingresa el valor de z: ");
        int z = sc.nextInt();

        int suma1 = x + y;
        int suma2 = y + z;
        int suma3 = x + z;

        int resultado;

        if (suma1 == 10 || suma2 == 10 || suma3 == 10) {
            resultado = 10;
        } else if (suma1 == suma3 + 10 || suma1 == suma2 + 10) {
            resultado = 5;
        } else {
            resultado = 0;
        }

        System.out.println("El resultado es: " + resultado);

        sc.close();
    }
}
