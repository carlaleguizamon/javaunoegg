/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package introjavaguia3;

import java.util.Scanner;



/**
 *
 * @author sebas
 */
public class introjavaguia3ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingrese una palabra o frase de 8 carácteres ");

        String frase = leer.nextLine();
     
        if (frase.length() == 8) {
        System.out.println(" La frase tiene la longitud CORRECTA");

    }
        else{
            System.out.println(" La frase tiene la longitud INCORRECTA");
        }
    }
    }
    
    

    
    

