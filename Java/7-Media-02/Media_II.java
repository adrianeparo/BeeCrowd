
import java.util.Locale;
import java.util.Scanner;

public class Media_II {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C ;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f%n" , MEDIA);

        sc.close();
    }
    
}
