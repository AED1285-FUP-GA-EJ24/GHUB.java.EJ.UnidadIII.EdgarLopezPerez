package basedatos;
import java.util.Scanner; 

public class Basedatos { 

    public void detDatos() { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingrese su nombre: "); 

        String nombre = sc.nextLine(); 

        System.out.print("Ingrese su edad: "); 

        int edad = sc.nextInt(); 

        System.out.print("Ingrese su ciudad de residencia: "); 

        String ciudad = sc.nextLine(); 

        System.out.print("Ingrese su altura (en metros): "); 

        float altura = sc.nextFloat(); 

        // Impresión formateada con printf

        System.out.printf("¡Hola %s! Tienes %d años, vives en %s y mides %.2f metros de altura.\n", nombre, edad, ciudad, altura); 

    } 

} 

 