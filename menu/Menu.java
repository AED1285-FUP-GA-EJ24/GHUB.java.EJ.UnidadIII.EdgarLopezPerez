package menu;

import java.util.Scanner;

public class Menu { 
    public void detMenuRestaurant() {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar el menú al usuario
        System.out.println("Menú del restaurante:");
        System.out.println("1. Pollo ($12)");
        System.out.println("2. Carne ($15)");
        System.out.println("3. Pescado ($18)");
        
        System.out.println("Seleccione una opción del menú:");
        int opcion = scanner.nextInt();
        
        double precio;
        switch (opcion) {
            case 1:
                precio = 12;
                break;
            case 2:
                precio = 15;
                break;
            case 3:
                precio = 18;
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa.");
                return; 
        }
        
        double totalSinIVA = precio;
        double totalConIVA = totalSinIVA * 1.12;
        
        System.out.println("Total a pagar (incluyendo 12% de IVA): $" + totalConIVA);
    }
}