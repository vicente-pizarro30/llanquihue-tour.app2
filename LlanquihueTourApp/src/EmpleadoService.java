package service;

import model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {
    private ArrayList<Empleado> colaboradores;

    public EmpleadoService(ArrayList<Empleado> colaboradores) {
        this.colaboradores = colaboradores;
    }

    // Operación 1: Recorrido completo
    public void mostrarCatalogoCompleto() {
        if (colaboradores.isEmpty()) {
            System.out.println("No hay colaboradores registrados en el sistema.");
            return;
        }
        for (Empleado emp : colaboradores) {
            System.out.println(emp);
        }
    }

    // Operación 2: Búsqueda y filtrado automatizado por cargo
    public void buscarPorCargo(String cargoBuscado) {
        System.out.println("\n--- RESULTADOS DE BÚSQUEDA PARA: " + cargoBuscado.toUpperCase() + " ---");
        boolean encontrado = false;

        for (Empleado emp : colaboradores) {
            if (emp.getCargo().equalsIgnoreCase(cargoBuscado)) {
                System.out.println(emp);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron registros de colaboradores con el cargo: " + cargoBuscado);
        }
    }
}