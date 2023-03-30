/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

 */
package introjavaguia3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia3ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrse la cantidad de elementos que debe tener el cuadrado");
        int nume = leer.nextInt();

        
        for (int i = 1; i < nume ; i++) {
            System.out.println("*");
            int num = 0;
          
            //System.out.println("*" );
            for (int j =  num  ; j < nume ; j++) {
            System.out.print("*");
            // no logro que sea un cuadrado, hay un punto afuera que falta en una esquina
        }
        
            
            }
        }
        
    }


        