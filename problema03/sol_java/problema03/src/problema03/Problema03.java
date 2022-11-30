/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author renat
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipo;
        double horas;
        double cuota;
        double total;
        double horas_extras;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado:");
        System.out.print("tipo: ");
        tipo = entrada.nextInt();
        
        System.out.println("Ingrese el número de horas trabajadas:");
        horas = entrada.nextDouble();
        
        System.out.println("Ingrese la cuota que se paga por hora:");
        cuota = entrada.nextDouble();
        
        
        if (horas > 40) {
            horas_extras = horas - 40;
            if (tipo == 1) {
                horas_extras = (horas_extras * cuota) * 1.5;
            }
            if (tipo == 2) {
                horas_extras = (horas_extras * cuota) * 2;
            }
            if (tipo == 3) {
                horas_extras = horas_extras * 2.5;
            }
            if (tipo == 4) {
                horas_extras = (horas_extras * cuota) * 3;
            }
            horas = 40 * cuota;
            total = horas + horas_extras;
        } else {
            total = cuota * horas;
        }
        System.out.printf("Nombre: %s\nEl sueldo por pagar es: $%.2f\n", 
                nombre, total);
    }
}
