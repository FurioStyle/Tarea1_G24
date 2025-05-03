package Productos;
/**
 * Clase abstracta que representa un Dulce.
 *
 * <p>Hereda de {@link Producto} y define los productos que son Dulces.</p>
 *
 * <p>Las subclases deben implementar {@code consumir}.</p>
 */
public abstract class Dulce extends Producto{
    /**
     * Crea un nuevo dulce con el número de serie indicado.
     *
     * @param x el número de serie del dulce.
     */
    public Dulce(int x){
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
