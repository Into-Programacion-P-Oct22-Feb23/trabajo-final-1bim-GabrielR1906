/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
         double angulo1;
         double angulo2;
         double angulo3;
         String tipo1 = "rectàngulo";
         String tipo2 = "obtusàngulo";
         String tipo3 = "acutángulo";
         
         System.out.println("Ingrese el valor del ángulo 1:");
         angulo1 = entrada.nextDouble();
         
         System.out.println("Ingrese el valor del ángulo 2:");
         angulo2 = entrada.nextDouble();
         
         System.out.println("Ingrese el valor del ánuglo 3:");
         angulo3 = entrada.nextDouble();
         
         if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
             System.out.println("Los angulos ingresador pertenecen"
                     + "a un triángulo " + tipo1);
         }else {
             if ((angulo1 > 90 && angulo1 <180) || (angulo2 > 90 && angulo2 <180)
                ||(angulo3 > 90 && angulo3 <180)) {
            System.out.println("Los angulos ingresador pertenecen"
                     + "a un triángulo " + tipo2);
             } else {
                 if (angulo1 < 90 || angulo2 < 90 || angulo3 < 90) {
                     System.out.println("Los angulos ingresador pertenecen"
                             + "a un triángulo " + tipo3);
                 }
             }
        }
    }
}
