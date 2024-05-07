package promedio;
import java.util.Scanner;

public class Promedio { 
    public void Detcalf() { 

        Scanner teclado = new Scanner(System.in);

        int r,n,total_calf;

        int acum_calf=0,cuenta=1;
        System.out.print("Proporciona cantidad de calificaciones a capturar:  ");
        total_calf = teclado.nextInt();
        while (cuenta<=total_calf) { 
            System.out.print("Proporciona parcial"+cuenta+":");
            n = teclado.nextInt();
            acum_calf += n;
            cuenta++;
        }  
        r = acum_calf/total_calf;
        System.out.print("Promedio = "+ r);
    }

}