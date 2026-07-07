package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CATÁLOGO DINÁMICO DE SERVICIOS - LLANQUIHUE TOUR ===\n");

        GestorServicios gestor = new GestorServicios();

        // Obtenemos la colección
        List<ServicioTuristico> lista = gestor.crearServiciosPrueba();

        // Recorremos con un for-each e invocamos el método polimórfico
        for (ServicioTuristico servicio : lista) {
            servicio.mostrarInformacion();
            // ¡La magia del polimorfismo! Java sabe exactamente qué método imprimir según el tipo de hijo.
        }
    }
}