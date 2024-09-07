import java.util.Locale;
import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v1, v2;

        v1 = sc.nextInt();
        v2 = sc.nextInt();

        int PROD = v1 * v2;

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}