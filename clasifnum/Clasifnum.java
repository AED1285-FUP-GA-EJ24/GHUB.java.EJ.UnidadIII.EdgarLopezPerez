package clasifnum;

import java.util.Scanner;

public class Clasifnum {
    public void detClasificacionNumeros() { 
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

      
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

       
        scanner.close();
    }
}