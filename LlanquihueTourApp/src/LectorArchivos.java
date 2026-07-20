package utils;

import model.Cliente;
import model.GuiaTuristico;
import model.Registrable;
import model.Rut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivos {

    public static List<Registrable> cargarDatosDesdeTXT(String rutaArchivo) {
        List<Registrable> entidades = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Estructura esperada: Tipo, RUT, Nombre, DatoExtra (Email o Especialidad)
                if (datos.length == 4) {
                    try {
                        Rut rutValido = new Rut(datos[1]);
                        if (datos[0].equalsIgnoreCase("Cliente")) {
                            entidades.add(new Cliente(rutValido, datos[2], datos[3]));
                        } else if (datos[0].equalsIgnoreCase("Guia")) {
                            entidades.add(new GuiaTuristico(rutValido, datos[2], datos[3]));
                        }
                    } catch (RutInvalidoException e) {
                        System.out.println("Error al cargar RUT desde archivo: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo txt inicial. Se iniciará sin datos pre-cargados.");
        }
        return entidades;
    }
}