package model;

public class GuiaTuristico extends Persona {
    private String especialidad;

    public GuiaTuristico(Rut rut, String nombre, String especialidad) {
        super(rut, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String mostrarDatos() {
        return "[GUÍA TURÍSTICO] Nombre: " + nombre + " | RUT: " + rut.toString() + " | Especialidad: " + especialidad;
    }
}