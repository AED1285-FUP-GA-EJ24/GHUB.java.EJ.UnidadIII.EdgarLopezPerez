package clasifcalificaciones;

import java.util.Scanner;

public class Clasifcal {
    public void detCalificacion() { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio del estudiante:");
        double promedio = scanner.nextDouble();

        System.out.println("El promedio ingresado es: " + promedio);
        
        String resultado;
        if (promedio >= 90) {
            resultado = "Excelente";
        } else if (promedio >= 80) {
            resultado = "Sobresaliente";
        } else if (promedio >= 70) {
            resultado = "Bueno";
        } else if (promedio >= 60) {
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }
        
        System.out.println("La clasificación del estudiante es: " + resultado);
    }
}