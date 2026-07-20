package app;

import data.GestorSistema;
import model.Cliente;
import model.Rut;
import utils.LectorArchivos;
import utils.RutInvalidoException;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestorSistema gestor = new GestorSistema();

        // 1. Cargar datos del archivo .txt inicial
        // Asegúrate de que "datos.txt" esté en la raíz del proyecto
        gestor.cargarListaInicial(LectorArchivos.cargarDatosDesdeTXT("datos.txt"));

        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Nuevo Cliente", "Ver Todos", "Filtrar Guías", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null,
                    "SISTEMA LLANQUIHUE TOUR\n¿Qué desea hacer?",
                    "EFT - Menú Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Nuevo Cliente
                    try {
                        String rutStr = JOptionPane.showInputDialog("Ingrese RUT (Ej: 11222333-4):");
                        if (rutStr == null) break;

                        // Esto lanzará RutInvalidoException si es muy corto
                        Rut rut = new Rut(rutStr);

                        String nombre = JOptionPane.showInputDialog("Ingrese Nombre:");
                        String email = JOptionPane.showInputDialog("Ingrese Email (Opcional, deje en blanco si no tiene):");

                        // Uso de Sobrecarga dependiendo si puso email o no
                        if (email == null || email.trim().isEmpty()) {
                            gestor.agregarEntidad(new Cliente(rut, nombre));
                        } else {
                            gestor.agregarEntidad(new Cliente(rut, nombre, email));
                        }
                        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito.");

                    } catch (RutInvalidoException e) {
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Validación", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 1: // Ver todos
                    JOptionPane.showMessageDialog(null, gestor.listarTodo());
                    break;

                case 2: // Filtrar Guías (usa instanceof)
                    JOptionPane.showMessageDialog(null, gestor.filtrarSoloGuias());
                    break;

                case 3: // Salir
                default:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar Llanquihue Tour App.");
                    break;
            }
        }
    }
}