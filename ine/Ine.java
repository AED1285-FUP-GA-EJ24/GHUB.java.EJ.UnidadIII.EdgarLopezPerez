package ine;
import java.util.Scanner;

public class Ine { 
    public void determinarIne() { 
        //definir la variable de salida
        Scanner teclado = new Scanner(System.in);

        String resultado;

        int añoActual,añoNacimiento;

        int años;

        System.out.println("Proporciona Año Actual: ");
        añoActual = teclado.nextInt();
        System.out.println("Proporciona Año Nacimiento: ");
        

        años = añoActual - añoNacimiento;

        if(años>=18) { 
            resultado = "Usted puede tramitar su INE";
        }
        else {
            resultado = "Usted NO puede tramitar su INE";
        }

        System.out.println(resultado);
       

        

    }


}