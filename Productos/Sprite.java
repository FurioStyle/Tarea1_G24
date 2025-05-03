package Productos;

/**
 * Clase que representa una bebida específica: Sprite.
 *
 * <p>Hereda de {@link Bebida} e implementa el metodo {@code consumir}</p>
 *
 */
public class Sprite extends Bebida {
    /**
     * Crea una nueva instancia de Sprite con su numero de serie correspondiente
     * @param x numero de serie de Sprite.
     */
    public Sprite(int x) {
    super(x);
    }
    /**
     * Devuelve que se consumio
     *
     * @return el String {@code "sprite"}
     */
    public String consumir() {
        return "sprite";
    }
}