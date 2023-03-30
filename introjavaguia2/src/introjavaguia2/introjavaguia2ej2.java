/*
 * Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.
 */
package introjavaguia2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia2ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      
        System.out.println("Escriba su nombre: ");
        String nombre = leer.next();
        System.out.println(nombre);    
        
    }
    
}
 
