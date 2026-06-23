package model;

/**
 * Clase que representa un Tour de la agencia.
 */
public class Tour {
    private String nombre;
    private String tipo;
    private int precio;

    // Constructor
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    // toString para mostrar los datos ordenados
    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo + " | Precio: $" + precio;
    }
}