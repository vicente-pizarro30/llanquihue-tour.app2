package app;
import model.Empleado;
import service.EmpleadoService;
import util.LectorArchivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  SISTEMA DE GESTIÓN MODULAR - LLANQUIHUE TOUR ");
        System.out.println("=============================================\n");

        // 1. Inicializar la herramienta de lectura utilitaria
        LectorArchivo lector = new LectorArchivo();
        String rutaArchivo = "resources/colaboradores.txt";

        // 2. Cargar datos dinámicamente resguardado por try-catch interno
        ArrayList<Empleado> listaCargada = lector.leerArchivoColaboradores(rutaArchivo);

        // 3. Pasar la colección cargada al módulo de servicios corporativos
        EmpleadoService servicio = new EmpleadoService(listaCargada);

        // 4. Ejecución de operaciones automatizadas solicitadas
        System.out.println("--- DESPLIEGUE COMPLETO DE PERSONAL ---");
        servicio.mostrarCatalogoCompleto();

        // 5. Aplicación de filtros específicos
        servicio.buscarPorCargo("Guía");
    }
}