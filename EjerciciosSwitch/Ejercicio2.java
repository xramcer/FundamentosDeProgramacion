import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int b = sc.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        String op = sc.next();

        String salida;

        switch (op) {
            case "+":
                salida = a + " + " + b + " = " + (a + b);
                break;
            case "-":
                salida = a + " - " + b + " = " + (a - b);
                break;
            case "*":
                salida = a + " * " + b + " = " + (a * b);
                break;
            case "/":
                if (b != 0) {
                    double div = (double) a / b;
                    salida = a + " / " + b + " = " + div;
                } else {
                    salida = "Error: no se puede dividir entre 0.";
                }
                break;
            default:
                salida = "Operación no válida. Use (+, -, *, /).";
        }

        System.out.println(salida);
        sc.close();
    }
}
