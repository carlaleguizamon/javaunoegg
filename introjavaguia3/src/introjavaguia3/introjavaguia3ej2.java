/*
 * Crear un programa que pida una frase y 
si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package introjavaguia3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia3ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        System.out.println(" Escriba una frase ");
        
      String frase = leer.nextLine();
         
        if (frase.equals("eureka")) {
            System.out.println("La frase es CORRECTA");
        }
        else{
            System.out.println(" La frase es INCORRECTA ");
        }
    }
    
}
