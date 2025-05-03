package Productos;
/**
 * Clase abstracta que representa una bebida.
 *
 * <p>Hereda de {@link Producto} y define los productos que son Bebidas.</p>
 *
 * <p>Las subclases deben implementar {@code consumir}.</p>
 */
public abstract class Bebida extends Producto{
    /**
     * Crea una nueva bebida con el número de serie indicado.
     *
     * @param x el número de serie de la bebida.
     */
    public Bebida(int x){
        super(x);
    }
    /**
     * Devuelve que se consume.
     *
     * @return un String que indica que se consumio.
     */
    @Override
    public abstract String consumir();
}