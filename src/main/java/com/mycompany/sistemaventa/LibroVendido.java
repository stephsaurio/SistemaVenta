package com.mycompany.sistemaventa;


/**
 *
 * @author stephany
 */
public class LibroVendido {
    public String titulo;
    public double precioIVA;
    public int cantidad;

    public LibroVendido(String titulo, double precioIVA, int cantidad) {
        this.titulo = titulo;
        this.precioIVA = precioIVA;
        this.cantidad = cantidad;
    }

}