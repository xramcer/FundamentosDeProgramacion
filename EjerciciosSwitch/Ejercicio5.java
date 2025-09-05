import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu día de nacimiento (1-31): ");
        int d = sc.nextInt();

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int m = sc.nextInt();

        String signo;

        switch (m) {
            case 1:  signo = (d <= 19) ? "Capricornio" : "Acuario"; break;
            case 2:  signo = (d <= 18) ? "Acuario" : "Piscis"; break;
            case 3:  signo = (d <= 20) ? "Piscis" : "Aries"; break;
            case 4:  signo = (d <= 19) ? "Aries" : "Tauro"; break;
            case 5:  signo = (d <= 20) ? "Tauro" : "Géminis"; break;
            case 6:  signo = (d <= 20) ? "Géminis" : "Cáncer"; break;
            case 7:  signo = (d <= 22) ? "Cáncer" : "Leo"; break;
            case 8:  signo = (d <= 22) ? "Leo" : "Virgo"; break;
            case 9:  signo = (d <= 22) ? "Virgo" : "Libra"; break;
            case 10: signo = (d <= 22) ? "Libra" : "Escorpio"; break;
            case 11: signo = (d <= 21) ? "Escorpio" : "Sagitario"; break;
            case 12: signo = (d <= 21) ? "Sagitario" : "Capricornio"; break;
            default: signo = "Mes no válido.";
        }

        System.out.println("Tu signo zodiacal es: " + signo);

        sc.close();
    }
}
