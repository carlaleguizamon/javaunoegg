/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaguia3;

/**
 *
 * @author sebas
 */
import java.util.Scanner;

public class ejemplo{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String entrada;
        int correcto = 0;
        int incorrecto = 0;

        while (true) {
            System.out.print("Ingrese una cadena: ");
            entrada = leer.nextLine();

            if (entrada.equals("&&&&&")) {
                break;
            }

            if (entrada.length() == 5 && entrada.charAt(0) == 'X' && entrada.charAt(4) == 'O') {
                correcto++;
            } else {
                incorrecto++;
            }
        }

        System.out.println("Ingresos correctos: " + correcto);
        System.out.println("Ingresos incorrectos: " + incorrecto);
    }
}