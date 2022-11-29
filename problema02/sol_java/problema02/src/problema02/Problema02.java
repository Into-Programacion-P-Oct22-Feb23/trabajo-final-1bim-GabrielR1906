/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int cantidad;
        double precio;
        double subtotal;
        double descuento;
        double total;
        
        System.out.println("Ingrese la cantidad de trajes:");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario de los trajes:");
        precio = entrada.nextDouble();
        
        subtotal = cantidad * precio;
        total = subtotal;
        descuento = 0;
        
        if (cantidad == 1) {
            descuento = (subtotal * 20) / 100;
            total = subtotal - descuento;
        } else {
            if (cantidad == 2) {
                descuento = (subtotal *25) / 100;
                total = subtotal - descuento;
            } else {
                if (cantidad == 3) {
                    descuento = (subtotal * 40) / 100;
                    total = subtotal - descuento;
                } else {
                    if (cantidad > 3) {
                        descuento = (subtotal * 50) / 100;
                        total = subtotal - descuento;
                    }
                }
            }
        }
        System.out.printf ("El subtotal por pagar es: $%.2f\nEl descuento "
                + "es: $%.2f\nEl total por pagar es: $%.2f\n", subtotal, 
                descuento, total);
    }
    
}
