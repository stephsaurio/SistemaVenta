package com.mycompany.sistemaventa;

public class Libros {
    String titulo;
    String autor;
    String genero;
    double precioIVA;
    int stock;

    public Libros(String titulo, String autor, String genero, double precioIVA, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precioIVA = precioIVA;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return titulo; // Retorna el título del libro para mostrar en el JComboBox
    }
    public void reducirStock(int cantidad) {
    if (cantidad <= stock) {
        stock -= cantidad;
    } else {
        throw new IllegalArgumentException("Stock insuficiente");
    }
}
}