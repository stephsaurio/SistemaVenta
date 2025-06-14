package com.mycompany.sistemaventa;

import java.util.ArrayList;
import java.util.Date;

public class Ventas {

    public double total;           // Total de la venta (con IVA)
    public double totalSinIVA;     // Total sin IVA
    public double descuento;        // Descuento aplicado
    public String nombreCliente;    // Nombre del cliente
    public String nit;             // NIT del cliente
    public String direccion;       // Dirección del cliente
    public String vendedor;        // Vendedor que realizó la venta
    public Date fecha;             // Fecha y hora de la venta
   public ArrayList<LibroVendido> librosVendidos;

public Ventas(double total, double totalSinIVA, double descuento,
              String vendedor, String nombreCliente, String nit, String direccion,
              Date fecha, ArrayList<LibroVendido> librosVendidos) {
    this.total = total;
    this.totalSinIVA = totalSinIVA;
    this.descuento = descuento;
    this.vendedor = vendedor;
    this.nombreCliente = nombreCliente;
    this.nit = nit;
    this.direccion = direccion;
    this.fecha = fecha;
    this.librosVendidos = librosVendidos;
}

    @Override
    public String toString() {
        return "Venta{"
                + "total=" + total
                + ", totalSinIVA=" + totalSinIVA
                + ", descuento=" + descuento
                + ", nombreCliente='" + nombreCliente + '\''
                + ", nit='" + nit + '\''
                + ", direccion='" + direccion + '\''
                + ", vendedor='" + vendedor + '\''
                + ", fecha=" + fecha
                + ", librosVendidos=" + librosVendidos
                + '}';
    }
}
