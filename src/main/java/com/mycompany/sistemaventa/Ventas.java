package com.mycompany.sistemaventa;

import java.util.Date;

public class Ventas {

    public String tituloLibro;     // Título del libro vendido
    public double precioUnitario;  // Precio del libro
    public int cantidad;           // Cantidad vendida
    public double total;           // Total de la venta
    public double totalSinIVA;     // Total sin IVA
    public String nombreCliente;    // Nombre del cliente
    public String nit;             // NIT del cliente
    public String direccion;       // Dirección del cliente
    public String vendedor;        // Vendedor que realizó la venta
    public Date fecha;             // Fecha de la venta

    // Constructor de la clase
    public Ventas(String tituloLibro, int cantidad, double precioUnitario, double total,
            String vendedor, String nombreCliente, String nit, String direccion, Date fecha) {
        this.tituloLibro = tituloLibro;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
        this.totalSinIVA = total / 1.12; 
        this.vendedor = vendedor;
        this.nombreCliente = nombreCliente;
        this.nit = nit;
        this.direccion = direccion;
        this.fecha = fecha;
    }

    // Método para obtener la representación en forma de cadena
    @Override
    public String toString() {
        return "Ventas{"
                + "tituloLibro='" + tituloLibro + '\''
                + ", precioUnitario=" + precioUnitario
                + ", cantidad=" + cantidad
                + ", total=" + total
                + ", totalSinIVA=" + totalSinIVA
                + ", nombreCliente='" + nombreCliente + '\''
                + ", nit='" + nit + '\''
                + ", direccion='" + direccion + '\''
                + ", vendedor='" + vendedor + '\''
                + ", fecha=" + fecha
                + '}';
    }
}
