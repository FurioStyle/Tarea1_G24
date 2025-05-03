package Productos;
/**
 * Clase que representa un dulce especifico: Super8.
 *
 * <p>Hereda de {@link Dulce} e implementa el metodo {@code consumir}</p>
 *
 */
public class Super8 extends Dulce {
    /**
     * Crea una nueva instancia de Super8 con su numero de serie correspondiente
     * @param x numero de serie de Super8.
     */
    public Super8(int x){
        super(x);
    }
    @Override
    /**
     * Devuelve que se consumio
     *
     * @return el String {@code "super8"}
     */
    public String consumir(){
        return "super8";
    }
}
