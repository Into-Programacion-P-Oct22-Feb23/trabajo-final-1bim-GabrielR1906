/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;
import java.util.Locale;

public class Problema5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String valor1;
        String valor2;
        double x;
        double y;
        valor1 = "";
        valor2 = "";

        System.out.println("Ingrese el valor de X");
        x = entrada.nextDouble();
        System.out.println("Ingrese el valor de Y");
        y = entrada.nextDouble();
        if (x > 0) {
            valor1 = "Positivo";
        }
        if (x < 0) {
            valor1 = "Negativo";
        }
        if (y > 0) {
            valor2 = "Positivo";
        }
        if (y < 0) {
            valor2 = "Negativo";
        }
        if (valor1 == "Positivo" && valor2 == "Positivo") {
            System.out.println("Sus coordenadas pertenecen al cuadrante 1");
        }
        if (valor1 == "Negativo" && valor2 == "Positivo") {
            System.out.println("Sus coordenadas pertenecen al cuadrante 2");
        }
        if (valor1 == "Negativo" && valor2 == "Negativo") {
            System.out.println("Sus coordenadas pertenecen al cuadrante 3");
        }
        if (valor1 == "Positivo" && valor2 == "Negativo") {
            System.out.println("Sus coordenadas pertenecen al cuadrante 4");
        }
    }
}
