/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import modelo.Cliente;

/**
 *
 * @author herra
 */
public class GestorCliente {
    public final static int MAX_CLIENTES = 8;
    private static final Cliente[] clientes = new Cliente[MAX_CLIENTES];
    
    
    public void aa(){
        System.out.println("aa");
    }
    
    
    
    public static boolean altaCliente(Cliente cliente){
        int pos = primeraPosicionVacia();
        if (pos>=0) {
            clientes[pos]= cliente;
            return true;
        }
        return false;
    }
    /**
     * Clase utilizada en altaEmpleado. Devuelve el numero int identificador de 
     * la primera posicion vacia de la lista "empleados" creada en la misma 
     * clase gestora. 
     * @return 
     */
    private static int primeraPosicionVacia(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] ==null) {
                return i;
            }
        }return -1;
    }
    public Cliente buscaPrimerCliente(String nombre){
        for (int i = 0; i < clientes.length; i++) {
            if (nombre.equals(clientes[i].getNombre())) {
                if (esEsteTuCliente()) {
                    return clientes[i];
                }
            }
        }return null;
    }
    private boolean esEsteTuCliente(){
        return true;
    }
    public static String listadoClientes() {
        String cadena="";
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i]!=null) {
                cadena+=clientes[i];
            }
        }return Cliente.cabecera+cadena;
    }
    public String bajaCliente(String nombre) {
        buscaPrimerCliente(nombre)=null;
        return "Correcto";
    }
}
