package com.mycompany.sistemaventa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.lang.reflect.Type;

public class SistemaVenta {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Libros> libros = new ArrayList<>();
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    public static ArrayList<Ventas> ventas = new ArrayList<>();
    public static ArrayList<Direcciones> direccion = new ArrayList<>();

    public static void main(String[] args) {
        String rutaLibros = "librosExportados.json";

        File archivoLibros = new File(rutaLibros);
        if (!archivoLibros.exists() || archivoLibros.length() == 0) {
            // Crear libros predeterminados
            libros.add(new Libros("El viaje de Chihiro", "Hayao Miyazaki", "Ficción", 100, 5));
            libros.add(new Libros("El principito", "Antoine de Saint-Exupéry", "Ficción", 100, 10));
            crearLibrosJSON(rutaLibros); // Guardar libros predeterminados
        } else {
            libros = cargarLibrosDesdeJSON(rutaLibros); // Cargar si ya existe
        }

        cargarCupones(); // Desde cupones.txt
        crearUsuarioPredeterminado(); // Crea usuarios predeterminados
        crearCuponPredeterminado();   // Crea cupon predeterminado
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

    private static void crearCuponPredeterminado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Cupones cupon = new Cupones("DESC10", 10, "porcentaje", LocalDate.parse("31/12/2025", formatter));
        cupones.add(cupon);
    }

    public static void crearLibrosJSON(String rutaArchivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(libros, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Libros> cargarLibrosDesdeJSON(String rutaArchivo) {
        ArrayList<Libros> librosCargados = new ArrayList<>();
        try (Reader reader = new FileReader(rutaArchivo)) {
            Gson gson = new Gson();
            Type tipo = new TypeToken<ArrayList<Libros>>() {
            }.getType();
            librosCargados = gson.fromJson(reader, tipo);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de errores
        }
        return librosCargados;
    }

    public static ArrayList<Usuario> leerUsuariosDesdeXML(String rutaArchivo) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(rutaArchivo));
            doc.getDocumentElement().normalize();

            NodeList lista = doc.getElementsByTagName("usuario");

            for (int i = 0; i < lista.getLength(); i++) {
                Node nodo = lista.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    String nombre = getTextContentSafe(elemento, "nombre");
                    String usuario = getTextContentSafe(elemento, "nombreUsuario");
                    String password = getTextContentSafe(elemento, "password");
                    String rolStr = getTextContentSafe(elemento, "rol");

                    int rol = rolStr.isEmpty() ? 0 : Integer.parseInt(rolStr);

                    Usuario u = new Usuario();
                    u.nombre = nombre;
                    u.usuario = usuario;
                    u.password = password;
                    u.rol = rol;

                    usuarios.add(u);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        }
        return usuarios;
    }

    private static String getTextContentSafe(Element elemento, String tagName) {
        NodeList nodeList = elemento.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            return node.getTextContent().trim();
        }
        return "";
// Devuelve una cadena vacía si el nodo no existe
    }

    public static void exportarVentasACSV(String rutaArchivo, ArrayList<Ventas> ventas) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Escribir encabezados
            writer.append("Nombre Cliente,NIT,Dirección,Total,Total Sin IVA,Descuento,Vendedor,Fecha\n");

            // Escribir ventas
            for (Ventas venta : ventas) {
                writer.append(venta.nombreCliente)
                        .append(",")
                        .append(venta.nit)
                        .append(",")
                        .append(venta.direccion)
                        .append(",")
                        .append(String.valueOf(venta.total))
                        .append(",")
                        .append(String.valueOf(venta.totalSinIVA))
                        .append(",")
                        .append(String.valueOf(venta.descuento))
                        .append(",")
                        .append(venta.vendedor)
                        .append(",")
                        .append(venta.fecha.toString()) // Convierte la fecha a cadena
                        .append("\n");
            }
            System.out.println("Informe de ventas exportado a: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportarUsuariosA_XML(ArrayList<Usuario> usuarios, String rutaArchivo) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            Element raiz = doc.createElement("usuarios");
            doc.appendChild(raiz);

            for (Usuario usuario : usuarios) {
                Element usuarioElement = doc.createElement("usuario");

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(usuario.nombre));
                usuarioElement.appendChild(nombre);

                Element nombreUsuario = doc.createElement("nombreUsuario");
                nombreUsuario.appendChild(doc.createTextNode(usuario.usuario));
                usuarioElement.appendChild(nombreUsuario);

                Element password = doc.createElement("password");
                password.appendChild(doc.createTextNode(usuario.password));
                usuarioElement.appendChild(password);

                Element rol = doc.createElement("rol");
                rol.appendChild(doc.createTextNode(String.valueOf(usuario.rol)));
                usuarioElement.appendChild(rol);

                raiz.appendChild(usuarioElement);
            }

            // Guardar el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(rutaArchivo));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace(); // Para depuración
        }
    }
}
