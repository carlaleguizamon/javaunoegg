/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package introjavaguia3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia3ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese un múmero ");

        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println(" El número es PAR");
        }
        else{
              System.out.println("El número es IMPAR");
              }
    }
    
}
