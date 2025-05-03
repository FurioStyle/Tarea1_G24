package Productos;
/**
 * Clase que representa una bebida específica: Fanta.
 *
 * <p>Hereda de {@link Bebida} e implementa el metodo {@code consumir}</p>
 *
 */
public class Fanta extends Bebida {
    /**
     * Crea una nueva instancia de Fanta con su numero de serie correspondiente
     * @param x numero de serie de Fanta.
     */
    public Fanta(int x){
        super(x);
    }
    /**
     * Devuelve que se consumio
     *
     * @return el String {@code "fanta"}
     */
    @Override
    public String consumir(){
        return "fanta";
    }
}
