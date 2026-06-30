package model;

public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras); // Llama al constructor del padre
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() { return numeroDeParadas; }
    public void setNumeroDeParadas(int numeroDeParadas) { this.numeroDeParadas = numeroDeParadas; }

    @Override
    public String toString() {
        // Aprovechamos el toString del padre y le sumamos lo propio de esta clase
        return super.toString() + " | Paradas: " + numeroDeParadas;
    }
}