/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero;
        int contador = 2;
        int suma = 0;
        
        System.out.println("Ingrese un número par:");
        numero = entrada.nextInt();
        
        if (numero <= contador) {
            System.out.println("error");
        }
        if (numero %2 == 0) {
            while (contador <= numero) {
                suma = suma + contador;
                contador = contador + 2;
            }
            System.out.println("La suma de los números pares del 2 hasta el "
                    + "número ingresado es:");
            System.out.println(suma);
        } else {
            System.out.println("Ese número no es par");
        }
        
    }
    
}
