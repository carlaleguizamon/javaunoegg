/*
 *Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjavaguia2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia2ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor en grados centÃ­grados: ");
        
        int celcius = leer.nextInt();
        int fahrenheit  = 32 + (9 * celcius / 5);
        
        System.out.println(" la temperatura en grados Fahrenheit es: " + fahrenheit);
        
        
        
    }
    
}

