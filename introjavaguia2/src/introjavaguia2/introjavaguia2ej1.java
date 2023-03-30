/*
 * Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */
package introjavaguia2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia2ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String calculo;

        System.out.println("ingrese un número");
        int num1;
        num1 = leer.nextInt();
        System.out.println("ingrese otro número");
        int num2;
        num2 = leer.nextInt();
        int suma;
        suma = num1 + num2;
        System.out.println(" El resultado es: " + suma);
    }

}
