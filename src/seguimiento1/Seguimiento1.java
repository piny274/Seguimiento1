/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento1;

import java.util.Scanner;

/**
 *
 * @author s109e12
 */
public class Seguimiento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner miScanner = new Scanner (System.in);
        System.out.print("Ingrese el número del mes ");
        int numero = miScanner.nextInt();
        
        System.out.println("El número ingresado es: " + numero);
        
        
        
     switch(numero){
     
         case 1:
             System.out.println("El mes es:  Enero");
             break;
         case 2:
             System.out.println("El mes es:  Febrero");
             break;
         case 3:
             System.out.println("El mes es:  Marzo");
             break;
             
         case 4:
             System.out.println("El mes es:  Abril");
             break;
         case 5:
             System.out.println("El mes es:  Mayo");
             break;
         case 6:
             System.out.println("El mes es:  Junio");
             break;
         case 7:
             System.out.println("El mes es:  Julio");
             break;
         case 8:
             System.out.println("El mes es:  Agosto");
             break;
         case 9:
             System.out.println("El mes es:  Septiembre");
             break;
         case 10:
             System.out.println("El mes es:  Octubre");
             break;
         case 11:
             System.out.println("El mes es:  Noviembre");
             break;
         case 12:
             System.out.println("El mes es:  Diciembre");
             break;    
         default:
             System.out.println("Caso por defecto");
             break;
     }
        
    }
    
}
