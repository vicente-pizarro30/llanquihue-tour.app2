package model;
import utils.RutInvalidoException;

public class Rut {
    private String numero;

    public Rut(String numero) throws RutInvalidoException {
        if (numero == null || numero.length() < 8) {
            throw new RutInvalidoException("El RUT ingresado no es válido: " + numero);
        }
        this.numero = numero;
    }

    public String getNumero() { return numero; }

    @Override
    public String toString() { return numero; }
}