import java.util.Scanner;

public class SucesionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, M, N;

        // Mientras
        System.out.println("Ingrese la cantidad de elementos de la serie Fibonacci:");
        N = sc.nextInt();

        A = 0;
        B = 1;
        M = 3;

        System.out.println(A);
        System.out.println(B);

        while (M <= N) {
            C = A + B;
            System.out.println(C);
            A = B;
            B = C;
            M++;
        }

        System.out.println("-----");

        // Repetir
        System.out.println("Ingrese la cantidad de elementos de la serie Fibonacci:");
        N = sc.nextInt();

        A = 0;
        B = 1;
        M = 3;

        System.out.println(A);
        System.out.println(B);

        do {
            C = A + B;
            System.out.println(C);
            A = B;
            B = C;
            M++;
        } while (M <= N);

        System.out.println("-----");

        // Para
        System.out.println("Ingrese la cantidad de elementos de la serie Fibonacci:");
        N = sc.nextInt();

        A = 0;
        B = 1;

        System.out.println(A);
        System.out.println(B);

        for (int I = 3; I <= N; I++) {
            C = A + B;
            System.out.println(C);
            A = B;
            B = C;
        }

        sc.close();
    }
}