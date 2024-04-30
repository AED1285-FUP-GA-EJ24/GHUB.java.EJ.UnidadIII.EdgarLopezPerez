package examen;
import java.util.Scanner;

public class Examen {
    public void detCalificacion() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la calificación del estudiante:");
        double calificacion = scanner.nextDouble();
        
        if (calificacion >= 70) {
            System.out.println("¡El estudiante ha aprobado el examen!");
        } else {
            System.out.println("El estudiante ha reprobado el examen.");
        }
    }
}