package utils;

// Excepción personalizada
public class RutInvalidoException extends Exception {
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}