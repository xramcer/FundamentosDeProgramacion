import java.util.Scanner;

public class AhorroAnual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double AH = 0;   
        int M = 1;       
        int CA;          
        
        while (M <= 12) {
            System.out.print("Ingrese la cantidad a ahorrar en el mes " + M + ": ");
            CA = sc.nextInt();
            
            AH = AH + CA;
            System.out.println("El ahorro acumulado hasta el mes " + M + " es: " + AH);
            
            M = M + 1;
        }
        
        System.out.println("-----------------------------------");
        System.out.println("El ahorro total al final del año es: " + AH);
        
        sc.close();
    }
}