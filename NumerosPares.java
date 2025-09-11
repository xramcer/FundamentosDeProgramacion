public class NumerosPares {
    public static void main(String[] args) {
        int N;

        N = 0;
        while (N <= 100) {
            System.out.println(N);
            N += 2;
        }

        System.out.println("-----");

        for (N = 0; N <= 100; N += 2) {
            System.out.println(N);
        }

        System.out.println("-----");

        N = 0;
        do {
            System.out.println(N);
            N += 2;
        } while (N <= 100);
    }
}