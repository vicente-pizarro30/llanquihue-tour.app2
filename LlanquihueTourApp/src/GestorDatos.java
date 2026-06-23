package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de la lectura del archivo de texto y conversión a objetos.
 */
public class GestorDatos {

    /**
     * Lee el archivo txt y retorna una lista de objetos Tour.
     * @param rutaArchivo Camino donde está el archivo text.
     * @return ArrayList con los tours cargados.
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Usamos BufferedReader para leer línea por línea de forma eficiente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Separamos los datos por el punto y coma
                String[] partes = linea.split(";");

                // Verificamos que la línea tenga los 3 datos requeridos
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String tipo = partes[1];
                    // Convertimos el precio de texto a número entero
                    int precio = Integer.parseInt(partes[2]);

                    // Instanciamos el objeto y lo agregamos a la colección
                    Tour nuevoTour = new Tour(nombre, tipo, precio);
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato numérico del archivo: " + e.getMessage());
        }

        return listaTours;
    }
}