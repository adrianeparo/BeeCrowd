import java.util.Locale;
import java.util.Scanner;

public class Media_I {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        Double B;

        A = sc.nextDouble();
        B = sc.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n" , MEDIA);

        sc.close();
    }
}
