package clases;

/**
 * Clase que representa un NIF (Número de Identificación Fiscal) español.
 */
public class Nif {

    private int numero;
    private char letra;

    // Array de letras correspondientes a los números del NIF
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
               'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
               'C', 'K', 'E'};

    /**
     * Calcula la letra correspondiente a un número del NIF.
     * @param numero El número del NIF.
     * @return La letra correspondiente al número del NIF.
     */
    static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    /**
     * Constructor por defecto de Nif.
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    /**
     * Constructor para crear un NIF con un número dado.
     * @param numero El número del NIF.
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Obtiene una representación en cadena del NIF.
     * @return Una cadena que representa el NIF en el formato "numero-letra".
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    /**
     * Establece el número del NIF y calcula la letra correspondiente.
     * @param numero El número del NIF.
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara este NIF con otro objeto para verificar si son iguales.
     * @param obj El objeto con el que se compara.
     * @return true si los NIFs son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
