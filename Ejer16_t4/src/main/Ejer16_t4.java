/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modelo.Cliente;
import gestor.GestorCliente;
import static gestor.GestorCliente.altaCliente;
import utils.UtilidadesGrafica;

/**
 *
 * @author herra
 */
public class Ejer16_t4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente n1 = new Cliente("Juan", 58.89f, "Tenis", 19);
        
        /*UtilidadesGrafica.muestraMensaje(n1.pagoCuota());  */
        System.out.println(n1.pagoCuoto());
        System.out.println(n1);
        rellenaCliente();
        System.out.println(GestorCliente.listadoClientes());
    }
    
    /**
     * Quitable
     */
    public static void rellenaCliente(){
        String[] nombres = {
            "Juan", "María", "Carlos", "Ana", "Pedro", "Luis", "Sofía", "Laura",
            "Javier", "Carmen", "Ricardo", "Elena", "Miguel", "Isabel", "Roberto",
            "Patricia", "Manuel", "Rosa", "Diego", "Raquel", "Antonio", "Lorena",
            "Fernando", "Natalia"
        };
        String[] deporte = {
            "Badminton", "Futbol", "Beisbol", "Pelota Punyo", "Natacion"
        };
        for (int i = 0; i < GestorCliente.MAX_CLIENTES; i++) {
            int numNombre = (int) (Math.random() * nombres.length);
            int numDeporte = (int) (Math.random() * deporte.length);
            String nombre = nombres[numNombre];
            int edad = (int) (Math.random() * 10);
            float cuota = (float) ((Math.random() * 10000) + 1) / 10;
            altaCliente(new Cliente(
                    nombre,
                    cuota,
                    deporte[numDeporte],
                    edad));
        }
    }
    
}
