/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaguia2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia2ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     System.out.println(" Ingrese un número: ");
        int num = leer.nextInt();
        // int numDoble = (n*3); tambien se puede asÃ­
        //int numTriple =  (n*3);tambien se puede asÃ­
       
        System.out.println(" el doble del número es " + (num * 2));

        System.out.println(" el triple del número es " + (num * 3));

        System.out.println(" la raíz cuadrada del número es " + Math.sqrt(num));
    }
    
}
