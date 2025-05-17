package com.mycompany.sistemaventa;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVenta {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libros> libros = new ArrayList<>();
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    public static ArrayList<Ventas> ventas = new ArrayList<>();
    public static ArrayList<Direcciones> direccion = new ArrayList<>();

    public static void main(String[] args) {
        CargarCupones.cargarCuponesDesdeCSV("cupones.txt");
        crearUsuarioPredeterminado(); // Crea usuarios predeterminados
        crearLibroPredeterminado(); // Crea libros predeterminados
        crearCuponPredeterminado();

        Login v = new Login();
        v.setVisible(true);
    }

    public static void cargarCupones() {
        try {
            Scanner sc = new Scanner(new File("cupones.txt"));
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split("\\|");
                if (partes.length == 4) {
                    String codigo = partes[0].trim();
                    double valor = Double.parseDouble(partes[1].trim());
                    String tipo = partes[2].trim();
                    LocalDate fecha = LocalDate.parse(partes[3].trim());
                    cupones.add(new Cupones(codigo, valor, tipo, fecha));
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error al cargar cupones: " + e.getMessage());
        }
    }

    private static void crearUsuarioPredeterminado() {
        Usuario admin = new Usuario();
        admin.usuario = "admin";
        admin.nombre = "admin";
        admin.rol = 0;
        admin.password = "admin";
        usuarios.add(admin);

        Usuario admin1 = new Usuario();
        admin1.usuario = "admin1";
        admin1.nombre = "admin";
        admin1.rol = 1;
        admin1.password = "admin";
        usuarios.add(admin1);

        Usuario vendedor = new Usuario();
        vendedor.usuario = "vendedor";
        vendedor.nombre = "admin";
        vendedor.rol = 2;
        vendedor.password = "123";
        usuarios.add(vendedor);
    }

    private static void crearLibroPredeterminado() {
        Libros libro1 = new Libros("El viaje de Chihiro", "Haiyao Miyazaki", "Ficción", 5, 100);
        Libros libro2 = new Libros("El principito", "sabrá dios", "Ficción", 10, 100);

        libros.add(libro1);
        libros.add(libro2);
    }

    private static void crearCuponPredeterminado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Cupones cupon = new Cupones("DESC10", 10, "porcentaje", LocalDate.parse("31/12/2025", formatter));
        cupones.add(cupon);
    }
}
