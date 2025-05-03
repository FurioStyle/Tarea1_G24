package Productos;

/** Clase abstracta que modela un producto generico, representado con un numero de serie
 */

public abstract class Producto {
    /**
     * Numero de serie unico del producto
     */
    private int serie;
    public Producto(int x){
        /**
         * @param x el numero de serie del producto
         */
        this.serie = x;
    }
    public int getSerie() {
        /**
         * Devuelve el numero de serie del producto.
         *
         * @return el numero de serie.
         */
        return serie;
    }
    /**
     * Devuelve el funcionamiento de consumir
     *
     * @return un String que muestra que se consumio.
     */
    public abstract String consumir();
}
