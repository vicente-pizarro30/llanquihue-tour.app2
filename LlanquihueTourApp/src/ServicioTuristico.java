package model;

public class ServicioTuristico {
    private String nombre;
    private int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }

    // Nuevo método base para aplicar Polimorfismo
    public void mostrarInformacion() {
        System.out.print("Servicio Base: " + nombre + " | Duración: " + duracionHoras + " horas");
    }
}