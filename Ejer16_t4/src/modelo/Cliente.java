/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author herra
 */
public class Cliente {
// Constantes
    private final float DESCUENTO = 25;
    private final float IVA = 21;
    private final int MAYORIA_EDAD = 18;
//Variables
    private String nombre;
    private float cuota;
    private String deporte;
    private int edad;
    public final static String cabecera = String.format("%15s%15s%15s%15s\n","Nombre", "Deporte", "Cuota", "Edad");
   
    public Cliente(String nombre, float cuota, String deporte, int edad) {
        this.nombre = nombre;
        this.cuota = cuota;
        this.deporte = deporte;
        this.edad = edad;
    }

    public float descuento(){
         float descuento  = 0;
        if (edad < MAYORIA_EDAD) {
            descuento = (cuota * DESCUENTO / 100);
        }
        return descuento;
    }
    
    public float calculosClientes(){
        
        return (cuota - descuento()) + (cuota * IVA / 100);
    }
    
    public String pagoCuoto() {
        float descuento = 0;
        if (edad < MAYORIA_EDAD) {

            descuento = (cuota * DESCUENTO)/ 100;
            float iva = cuota * 0.21f;
            float pagar = cuota - descuento + iva;
            return String.format("Cliente:  %s n"
                    + "Deporte:  %s \n"
                    + "Cuota: %,.2f \n"
                    + "Descuento:  %,.2f \n"
                    + "Iva(21): %,.2f \n"
                    + "Total a pagar: %,.2f", nombre, deporte, cuota, descuento, iva, pagar);
        }


        float iva = cuota * 0.21f;
        float pagar = cuota + iva;
        return String.format("Cliente:  %s \n"
                + "Deporte:  %s \n"
                + "Cuota: %,.2f \n"
                + "Iva(21): %,.2f \n"
                + "Total a pagar: %,.2f", nombre, deporte, cuota, iva, pagar);
    }

    private String pagoCuota(){
        if (edad < MAYORIA_EDAD) {
            float descuento = descuento();
            float iva = (cuota - descuento() * IVA) /100;
            return String.format("========= \nCliente: %s \n Deporte: %s\nCuota: %f\n Descuento: %f\nIVA (21%%): %f\n Total: %f", nombre, deporte, cuota, descuento,iva, cuota - descuento + iva);
        }else {
            float descuento = descuento();
            float iva = (cuota - descuento() * IVA) /100;
            return String.format("========= \nCliente: %s \n Deporte: %s\nCuota: %f\nIVA (21%%): %f\n Total: %f", nombre, deporte, cuota,iva, cuota - descuento + iva);
        }
    }
    public String toString(){
        return String.format("%15s%15s%14.2f$%15s\n",nombre, deporte, cuota, edad);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private float getCuota() {
        return cuota;
    }

    private void setCuota(float cuota) {
        this.cuota = cuota;
    }

    private String getDeporte() {
        return deporte;
    }

    private void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    private int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }
}
