
import java.util.Scanner;
import java.util.scanner;

import ine.Ine;

public class principal { 
    public static void main(string[]args) {

        Scanner teclado = new Scanner(system.in);

        int opcion;

        System.out.println("********************************************");
        System.out.println("            MENU DE OPCIONES                ");
        System.out.println("********************************************");
        System.out.println("1) CALCULAR EDAD");
        System.out.println("2) HERMANO MAYOR");
        System.out.println("3) INCENTIVOS DE UNIDAD PRODUCIDAS");
        System.out.println("4) DETERMINAR MAYORDE 3 NUM");
        System.out.println("5) TIPO DE TRIANGULO");
        System.out.println("6) CONVERTIR ARABIGO A ROMANO");
        System.out.println("7) CONVERTIR CARACTER A VOCAL");
        System.out.println("8) MENOR, IGUAL O MAYOR DE 3");
        System.out.println("9) DETERMINAR TIPO DE CALIFICACION");
        System.out.println("10)SELECCIONAR TIPO DE TARIFA");
        System.out.println("********************************************");
        System.out.println("SELECCION DE OPCION");
        opcion = teclado.nextInt();

        switch(opcion) { 
            case 1:
                Ine objIne = new Ine();
                objIne.determinarIne();



    

    }


}