package com.mycompany.sistemaventa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class CargarCupones {

        public static void cargarCuponesDesdeCSV(String rutaArchivo) {
             SistemaVenta.cupones.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean primeraLinea = true;

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue; 
                }

                String[] partes = linea.split("\\|");

                if (partes.length == 4) {
                    String codigo = partes[0].trim();
                    double valor = Double.parseDouble(partes[1].trim());
                    String tipo = partes[2].trim();
                    LocalDate fecha = LocalDate.parse(partes[3].trim());

                    // Verificar si ya existe un cupón con el mismo código
                    boolean cuponExistente = false;
                    for (Cupones cupon : SistemaVenta.cupones) {
                        if (cupon.codigo.equals(codigo)) {
                            cuponExistente = true;
                            break;
                        }
                    }

                    // Solo agregar si no existe un cupón con el mismo código
                    if (!cuponExistente) {
                        Cupones cupon = new Cupones(codigo, valor, tipo, fecha);
                        SistemaVenta.cupones.add(cupon);
                    }
                }
            }

            System.out.println("Cupones cargados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir valor a número: " + e.getMessage());
      
        }
    }
}
