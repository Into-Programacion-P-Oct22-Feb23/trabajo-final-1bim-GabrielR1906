/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herezz
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double numero1;
        double numero2;
        double numero3;
        
        System.out.println("Ingrese el primer número:");
        numero1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        numero2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        numero3 = entrada.nextDouble();
        
        if (numero1 == numero2 && numero1 == numero3) {
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("El número mayor es: " + numero1);
            }
        } else {
            if (numero1 == numero2 || numero1 == numero3) {
                System.out.println("Nùmeros incorrectos, ingrese otros nùmeros");
            }
            if (numero2 != numero1 && numero2 != numero3) {
                if(numero2 > numero1 && numero2 > numero3) {
                    System.out.println("EL nùmero mayor es: " + numero2);
                }
            } else {
                if (numero2 == numero1 || numero2 == numero3) {
                    System.out.println("Nùmeros incorrectos, ingrese otros "
                            + "nùmeros");
                }
            }
        } if (numero3 != numero2 && numero3 != numero1) {
            if(numero3 > numero2 && numero3 > numero1) {
                System.out.println("EL nùmero mayor es: " + numero3);
            }
        } else {
            if (numero3 == numero2 || numero3 == numero1) {
                System.out.println("Nùmeros incorrectos, ingrese otros "
                        + "nùmeros");
            }
        }
    }
    
}
