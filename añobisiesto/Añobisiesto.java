package añobisiesto; 
import java.util.Scanner;

public class Añobisiesto {
    public void detAñoBisi() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        int ano = scanner.nextInt();

        // Determinar si el año es bisiesto o no
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}