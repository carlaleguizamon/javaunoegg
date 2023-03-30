/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario
hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjavaguia3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia3ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero limite" );
        
        int numLim = leer.nextInt();
        
        System.out.println(" ingrese un numero");
        
        int num1;
        
        num1 = leer.nextInt();
        
        System.out.println(" ingrese otro numero");
        
        int num2 = leer.nextInt();
        
        int suma = num1 + num2 ;

        if (suma < numLim) {
            System.out.println(" el resultado de la suma es: " + suma);
        } else {
            System.out.println(" el resultado supera el limite");
        }

    }
}
        
    
        
        
        
        
   
    

