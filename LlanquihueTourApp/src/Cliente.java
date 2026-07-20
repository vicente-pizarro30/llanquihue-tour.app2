package model;

public class Cliente extends Persona {
    private String email;

    // Constructor completo
    public Cliente(Rut rut, String nombre, String email) {
        super(rut, nombre);
        this.email = email;
    }

    // SOBRECARGA de constructores (Requisito de la pauta)
    public Cliente(Rut rut, String nombre) {
        super(rut, nombre);
        this.email = "Sin email";
    }

    @Override
    public String mostrarDatos() {
        return "[CLIENTE] Nombre: " + nombre + " | RUT: " + rut.toString() + " | Email: " + email;
    }
}