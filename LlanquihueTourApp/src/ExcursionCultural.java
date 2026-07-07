package model;

public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Sobrescritura del método
    @Override
    public void mostrarInformacion() {
        System.out.println("[Excursión Cultural] " + getNombre() + " | Duración: " + getDuracionHoras() + " hrs | Lugar Histórico: " + lugarHistorico);
    }
}