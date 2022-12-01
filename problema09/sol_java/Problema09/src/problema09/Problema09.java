/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema09;

/**
 *
 * @author Cococ
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int contador;
        String mensaje;
        String mas;
        String menos;
        int resultado;

        a = 0;
        b = 0;
        contador = 0;
        mensaje = "";
        mas = "+";
        menos = "-";
        resultado = 0;

        while (contador <= 3) {

            contador = contador + 1;
            a = a + 12;
            b = b + 11;
            resultado = resultado + a - b;
            if (b == 44) {
                mas = "";
            }
            mensaje = mensaje + a + menos + b + mas;
        }
        System.out.printf("S1= "+mensaje+"\n");
        System.out.printf("El resultado es : "+resultado+"\n");
    }

}
