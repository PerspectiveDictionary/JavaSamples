/**
 * Utilidades para pedir datos por teclado
 */

package utils;

import java.util.Scanner;

/**
 *
 * @author AluDAM
 */
public class Utilidades {
    
    public static String muestraCabecera(){
      return  String.format("%-40s %-40s %5s %5s %5s \n", "TITULO", "AUTOR", "PRESTAMOS","PRESTADO", "PRESTABLE");
    }

    public static int pideEnteroPositivo(String cadena){
         String numero = pideCadena(cadena);
         while (!esNumero(numero)) {
             numero = pideCadena("Muy mal, no es un entero positivo: ");
        }
         System.out.println(numero);
         return Integer.parseInt(numero);
         
    }
    
    public static String pideCadena(String cadena){
        Scanner teclado = new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextLine();
    }
    
    
    public static boolean esNumero(String numero){
        for (int i = 0; i < numero.length(); i++) {
            if (!esNumero(numero.charAt(i))){
                return false;
            }
        } // fin del for
        return true;
    }
    
    public static boolean esNumero(char letra){
        String numeros = "0123456789";
        return numeros.contains(letra + "");
 
    }
    
    
}
