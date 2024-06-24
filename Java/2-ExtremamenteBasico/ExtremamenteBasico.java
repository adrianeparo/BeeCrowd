

import java.util.Scanner;

public class ExtremamenteBasico {

    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         int A, B, X;
         System.out.println("Insira o valor de A: ");
         A = scanner.nextInt();
         System.out.println("Insira o valor de B: ");
         B = scanner.nextInt();
         
         X = A + B;
         
         System.out.println("X = " + X);
        
         scanner.close();
 
    }
    
}
