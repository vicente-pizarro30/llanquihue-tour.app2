package data;

import model.Registrable;
import model.Cliente;
import model.GuiaTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorSistema {
    // Colección Polimórfica
    private List<Registrable> listaEntidades;

    public GestorSistema() {
        this.listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
        entidad.registrar();
    }

    public void cargarListaInicial(List<Registrable> iniciales) {
        listaEntidades.addAll(iniciales);
    }

    public String listarTodo() {
        if (listaEntidades.isEmpty()) return "No hay registros.";
        StringBuilder sb = new StringBuilder("=== TODOS LOS REGISTROS ===\n");
        for (Registrable r : listaEntidades) {
            sb.append(r.mostrarDatos()).append("\n");
        }
        return sb.toString();
    }

    // Método que usa instanceof (Requisito de la pauta)
    public String filtrarSoloGuias() {
        StringBuilder sb = new StringBuilder("=== EQUIPO DE GUÍAS ===\n");
        boolean hayGuias = false;

        for (Registrable r : listaEntidades) {
            if (r instanceof GuiaTuristico) {
                sb.append(r.mostrarDatos()).append("\n");
                hayGuias = true;
            }
        }
        return hayGuias ? sb.toString() : "No hay guías registrados.";
    }
}