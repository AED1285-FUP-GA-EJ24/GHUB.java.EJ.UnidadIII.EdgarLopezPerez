package descuento;

import java.util.Scanner;

public class Descuento {
    public void detdesc() { 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el monto de la compra:");
        double montoCompra = scanner.nextDouble();
        
        double totalPagar;
        if (montoCompra > 100) {
            totalPagar = montoCompra * 0.9; // Aplica descuento del 10%
        } else {
            totalPagar = montoCompra;
        }
        
        System.out.println("El total a pagar es: $" + totalPagar);
    }
}