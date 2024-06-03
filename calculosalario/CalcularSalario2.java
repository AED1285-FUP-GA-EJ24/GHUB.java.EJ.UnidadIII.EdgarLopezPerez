package calculosalario;
import java.util.Scanner;
public class CalcularSalario2{ 
    public void detSalario(){
        Scanner teclado = new Scanner(System.in);
        double salarioActual, nuevoSalario, aumento,aumentoTotal;
        final int CENTINELA= -9;
        int i=1;
        aumentoTotal= 0;
        System.out.println("Ingreso datos de empleado : "+i+"(-9 para terminar):");
        salarioActual = teclado.nextDouble();
        while (salarioActual !=CENTINELA) { 
            if (salarioActual <= 9000){ 
            aumento = 0.2;
            } else if (salarioActual <= 150000){ 
            aumento = 0.1;
            } else if (salarioActual <= 20000){ 
            aumento = 0.5;
            }else { 
                aumento= 0;
            }

            nuevoSalario= salarioActual + (salarioActual * aumento);
            System.out.println("El aumento es: $"+salarioActual*aumento);
            System.out.println("El nuevo salario del empleado es: $"+ nuevoSalario);
        }
    }          
    

}