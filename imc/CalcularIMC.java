package imc;
import java.util.Scanner; 

public class CalcularIMC { 

 
    public void detIMC() { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingrese su peso (en kg): "); 

        double peso = sc.nextDouble(); 

        System.out.print("Ingrese su altura (en metros): "); 

        double altura = sc.nextDouble(); 

        double imc = peso / (altura * altura); 

       String clasificacion = (imc < 18.5) ? "Bajo peso" : 

                              	      (imc >= 18.5 && imc <= 24.9) ? "Peso normal" : 

                              	     (imc >= 25 && imc <= 29.9) ? "Sobrepeso" : "Obesidad"; 

        System.out.println("Su IMC es: " + imc); 

        System.out.println("Su clasificación nutricional es: " + clasificacion); 

    } 

} 