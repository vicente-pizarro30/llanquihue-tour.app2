package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CATÁLOGO DE SERVICIOS - LLANQUIHUE TOUR ===\n");

        // Instanciamos el gestor
        GestorServicios gestor = new GestorServicios();

        // Llamamos al método y guardamos los servicios generados
        ServicioTuristico[] listaServicios = gestor.crearServiciosPrueba();

        // Mostramos los objetos por consola (aplicando Polimorfismo y toString)
        for (ServicioTuristico servicio : listaServicios) {
            System.out.println(servicio.toString());
        }
    }
}