package Monedas;
/**
 * Clase base para representar una moneda.
 * Cada tipo de moneda debe especificar su valor.
 */

public abstract class Moneda implements Comparable<Moneda> {
    private int serie;

    public Moneda() {}
    /**
     * Devuelve el valor de la moneda.
     */
    public abstract int getValor();
    /**
     * Devuelve la instancia de la moneda.
     */
    public Moneda getSerie() {
        return this;
    }
    /**
     * Compara dos monedas por su valor.
     */
    @Override
    public int compareTo(Moneda otra) {
        return Integer.compare(this.getValor(), otra.getValor());
    }
}
