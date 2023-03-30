/*Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.

 */
package introjavaguia3;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class introjavaguia3ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println(" Seleccione una opción del menu ");
        int menu = leer.nextInt();
        
        
       
        
        
        switch(menu)
        {
        
        case 1:
        System.out.println(" Sumar");
        break;
        case 2:
        System.out.println(" Restar");
        break;
        case 3:
        System.out.println(" Multiplicar");
        break;
        case 4:
        System.out.println(" Dividir ");
        break;
        case 5:
        System.out.println(" Sslir");
        break;
        
        default:
        System.out.println("la opcion ingresada no es correcta");
    }
        
    }
    
}
