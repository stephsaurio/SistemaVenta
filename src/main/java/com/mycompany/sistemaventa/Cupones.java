package com.mycompany.sistemaventa;
import java.time.LocalDate;

public class Cupones {
    public String codigo;
    public double valor;
    public String tipoDescuento; // "porcentaje" o "fijo"
  public LocalDate fechaVencimiento;
    // Constructor
    public Cupones(String codigo, double valor, String tipoDescuento, LocalDate fechaVencimiento) {
        this.codigo = codigo;
        this.valor = valor;
        this.tipoDescuento = tipoDescuento;
         this.fechaVencimiento = fechaVencimiento;
    }
}