package com.mycompany.sistemaventa;

public class DetalleVenta {

    public String nombreLibro;
    public int cantidad;
    public double precioUnitario;

    public DetalleVenta(String nombreLibro, int cantidad, double precioUnitario) {
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
}
