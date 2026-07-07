package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Sobrescritura del método
    @Override
    public void mostrarInformacion() {
        System.out.println("[Ruta Gastronómica] " + getNombre() + " | Duración: " + getDuracionHoras() + " hrs | Paradas: " + numeroDeParadas);
    }
}