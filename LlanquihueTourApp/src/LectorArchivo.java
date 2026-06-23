package util;

import model.Empleado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivo {

    public ArrayList<Empleado> leerArchivoColaboradores(String ruta) {
        ArrayList<Empleado> lista = new ArrayList<>();

        // try-with-resources: asegura el cierre automático del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Validación de líneas vacías
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(";");

                // Control preventivo de estructura de la línea
                if (datos.length == 4) {
                    String rut = datos[0].trim();
                    String nombre = datos[1].trim();
                    String cargo = datos[2].trim();
                    int sueldo = Integer.parseInt(datos[3].trim());

                    Empleado emp = new Empleado(rut, nombre, cargo, sueldo);
                    lista.add(emp);
                }
            }
        } catch (IOException e) {
            System.out.println("[Error de Lectura] No se pudo acceder al archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[Error de Formato] El sueldo en el archivo contiene caracteres no numéricos: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("[Error de Validación] Datos inconsistentes encontrados: " + e.getMessage());
        }

        return lista;
    }
}