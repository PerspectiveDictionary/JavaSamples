/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JOptionPane;

/**
 * Ejer17

Crear una clase llamada Utilidades.  En ella tendremos los siguientes métodos

public  static  int pideEntero(String mensaje)

public static int  pideEnteroPositivo(String mensaje)

public static float pideFloat(String mensaje)

public static String pideCadena(String mensaje)

public static void muestraMensaje(String mensaje)

Repetir lo mismo creando una clase llamada UtilidadesGrafica


 * 
 * @author AluDAM
 */
public class UtilidadesGrafica {
    
    private static final String NOMBRE_EMPRESA = "Los enlaces";
    public static String muestraCabecera(){
      return  String.format("%-40s %-40s %5s %5s %5s \n", "TITULO", "AUTOR", "PRESTAMOS","PRESTADO", "PRESTABLE");
    }
    
    public static int pideEnteroPositivo(String cadena){
         String numero = pideCadena(cadena);
         
         while (!esNumero(numero)) {
             numero = pideCadena("Muy mal, no es un entero positivo: ");
        }
        return Integer.parseInt(numero);
    }

    public static int pideNumero(String numero){
        numero = JOptionPane.showInputDialog(null,numero,
                NOMBRE_EMPRESA, JOptionPane.QUESTION_MESSAGE);
        return Integer.parseInt(numero);
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
   
    public static String pideCadena(String mensaje){
        return JOptionPane.showInputDialog(null,mensaje,
                NOMBRE_EMPRESA, JOptionPane.QUESTION_MESSAGE);
    }
    
     public static void muestraMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,
                NOMBRE_EMPRESA, JOptionPane.INFORMATION_MESSAGE);
    } 
     public static void muestraNumero(int numero){
         JOptionPane.showMessageDialog(null, numero,
                NOMBRE_EMPRESA, JOptionPane.INFORMATION_MESSAGE);
    }
     
     public static void muestraDouble(double numero){
         JOptionPane.showMessageDialog(null, numero + " Este es ",
                NOMBRE_EMPRESA, JOptionPane.INFORMATION_MESSAGE);
    }
     public static void muestraFloat(float numero){
         JOptionPane.showMessageDialog(null, (float)numero + " Este es ",
                NOMBRE_EMPRESA, JOptionPane.INFORMATION_MESSAGE);
    }
     
     
    public static void muestraError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,
                NOMBRE_EMPRESA, JOptionPane.ERROR_MESSAGE);
    } 
    
     public static float pideFloat(String mensaje){
         String numFloat = pideCadena(mensaje);
        
         
         
         return Float.parseFloat(numFloat);
     }

     public static float pideFloatPositivo(String mensaje){
         String numFloat = pideCadena(mensaje);
         
         float numf = Float.parseFloat(numFloat);
         
         while (numf < 0) {
             numFloat = pideCadena("Muy mal, no es un decimal positivo: ");
             numf = Float.parseFloat(numFloat);
        }
        return Float.parseFloat(numFloat);
    }
     
     
      public static double pideDouble(String mensaje){
         String numDouble = pideCadena(mensaje);
        
         return Double.parseDouble(numDouble);
     }
}
