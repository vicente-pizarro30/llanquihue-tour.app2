package model;

public abstract class Persona implements Registrable {
    protected Rut rut; // Aplicación de Composición
    protected String nombre;

    public Persona(Rut rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    // Getters y Setters (Encapsulamiento)
    public Rut getRut() { return rut; }
    public void setRut(Rut rut) { this.rut = rut; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public void registrar() {
        System.out.println("Registrando en el sistema a: " + this.nombre);
    }
}