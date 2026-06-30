package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    // Método que crea 2 instancias de cada subclase y las retorna en un arreglo
    public ServicioTuristico[] crearServiciosPrueba() {
        ServicioTuristico[] servicios = new ServicioTuristico[6];

        // 2 Rutas Gastronómicas
        servicios[0] = new RutaGastronomica("Ruta del Salmón", 4, 3);
        servicios[1] = new RutaGastronomica("Sabores de Chiloé", 6, 5);

        // 2 Paseos Lacustres
        servicios[2] = new PaseoLacustre("Navegación Todos los Santos", 3, "Catamarán");
        servicios[3] = new PaseoLacustre("Tour Volcán Osorno", 2, "Lancha Rápida");

        // 2 Excursiones Culturales
        servicios[4] = new ExcursionCultural("Colonos Alemanes", 5, "Museo Colonial");
        servicios[5] = new ExcursionCultural("Mitología Chilota", 4, "Iglesias de Madera");

        return servicios;
    }
}