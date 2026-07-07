package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    // Ahora retorna un List en lugar de un arreglo
    public List<ServicioTuristico> crearServiciosPrueba() {
        // Declaramos la colección de tipo List
        List<ServicioTuristico> listaDeServicios = new ArrayList<>();

        // Cargamos al menos 5 objetos combinando subclases usando el método add()
        listaDeServicios.add(new RutaGastronomica("Ruta del Salmón", 4, 3));
        listaDeServicios.add(new RutaGastronomica("Sabores de Chiloé", 6, 5));
        listaDeServicios.add(new PaseoLacustre("Navegación Todos los Santos", 3, "Catamarán"));
        listaDeServicios.add(new PaseoLacustre("Tour Volcán Osorno", 2, "Lancha Rápida"));
        listaDeServicios.add(new ExcursionCultural("Colonos Alemanes", 5, "Museo Colonial"));

        return listaDeServicios;
    }
}