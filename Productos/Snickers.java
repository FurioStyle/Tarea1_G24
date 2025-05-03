package Productos;
/**
 * Clase que representa un dulce especifico: Snickers.
 *
 * <p>Hereda de {@link Dulce} e implementa el metodo {@code consumir}</p>
 *
 */
public class Snickers extends Dulce{
    /**
     * Crea una nueva instancia de Snickers con su numero de serie correspondiente
     * @param x numero de serie de Snickers.
     */
    public Snickers(int x){
        super(x);
    }
    @Override
    /**
     * Devuelve que se consumio
     *
     * @return el String {@code "snickers"}
     */
    public String consumir(){
        return "snickers";
    }
}
