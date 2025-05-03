package Productos;
/**
 * Enumeración que representa distintos tipos de productos disponibles,
 * junto con su precio asociado.
 *
 * <p>Cada uno representa un producto específico y su precio.</p>
 */
 public enum ProductoEnum {
    /** Producto Coca Cola con precio 1000. */
    COCA_COLA(1000),
    /** Producto Sprite con precio 900. */
    SPRITE(900),
    /** Producto Fanta con precio 900. */
    FANTA(900),
    /** Producto Super8 con precio 700. */
    SUPER8(700),
    /** Producto Snickers con precio 800. */
    SNICKERS(800);

    private final int precio;

    /**
     * Se asigna un precio a cada producto.
     *
     * @param precio es el precio del producto.
     */
    ProductoEnum(int precio) {
        this.precio = precio;
    }
    /**
     * Devuelve el precio del producto.
     *
     * @return el precio.
     */
    public int getPrecio() {
        return precio;
    }
}
