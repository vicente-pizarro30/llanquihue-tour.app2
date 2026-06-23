package model;

public class Empleado {
    private String rut;
    private String nombre;
    private String cargo;
    private int sueldo;

    // Constructor
    public Empleado(String rut, String nombre, String cargo, int sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.cargo = cargo;
        setSueldo(sueldo); // Usa el setter para aprovechar la validación
    }

    // Getters y Setters con validación básica (Paso 2 de la pauta)
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public int getSueldo() { return sueldo; }

    public void setSueldo(int sueldo) {
        if (sueldo < 0) {
            throw new IllegalArgumentException("El sueldo no puede ser un valor negativo.");
        }
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}