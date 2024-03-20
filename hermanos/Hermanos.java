package hermanos;
import java.util.Scanner;
public class Hermanos { 
    public void detHermanoMayor() { 
        Scanner teclado = new Scanner(System.in);

        String hermanoMayor;
        String hermano1,hermano2;
        int edad1,edad2;
        int difEdad;

        System.out.println("Nombre del primer hermano: ");
        hermano1 = teclado.next();
        System.out.println("Edad del primer hermano: ");
        edad1 = teclado.nextInt();
        System.out.println("Nombre del segundo hermano: ");
        hermano2 = teclado.next();
        System.out.println("Edad del segundo hermano: ");
        edad2 = teclado.nextInt();

        if(edad1>edad2) { 
            difEdad = edad1 - edad2;
            hermanoMayor = hermano1;

        }
        else {
            difEdad = edad1 - edad2;
            hermanoMayor = hermano2;
        }






    }


}
