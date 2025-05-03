package Productos;
/**
 * Clase que representa una bebida específica: CocaCola.
 *
 * <p>Hereda de {@link Bebida} e implementa el metodo {@code consumir}</p>
 *
 */
public class CocaCola extends Bebida{
    /**
     * Crea una nueva instancia de CocaCola con su numero de serie correspondiente
     * @param x numero de serie de CocaCola.
     */
    public CocaCola(int x){
        super(x);
    }
    /**
     * Devuelve que se consumio
     *
     * @return el String {@code "cocacola"}
     */
    @Override
    public String consumir(){
        return "cocacola";
    }

}
