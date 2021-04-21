/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Sistemas-08
 */
public class Factura {
    private String codproduc;
    private String nombre;
    private int cantidad;
    private float precio;
    private float subtotal;
    
    public Factura(String codproduc, String nombre, int cantidad, float precio, float subtotal) {
        this.codproduc = codproduc;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public String getCodproduc() {
        return codproduc;
    }

    public void setCodproduc(String codproduc) {
        this.codproduc = codproduc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
     public String toString() {
        return "Factura{" + "Codigo de Producto=" + codproduc+ ", Nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", subtotal=" + subtotal + '}';
    }
     
     public Object[] asArray(){
        Object[] obj = new Object[14];
        
        obj[0] = codproduc;
        obj[1] = nombre;
        obj[2] = cantidad;
        obj[3] = precio;
        obj[4] = subtotal;
        
        return obj;
    }
    
}
