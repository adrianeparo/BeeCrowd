import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasMes = sc.nextDouble();

        double bonus = vendasMes * (15.0 / 100);
        double salarioMes = salarioFixo + bonus; 
        
        System.out.printf("TOTAL = R$ %.2f%n", salarioMes);

        sc.close();
    }
}
