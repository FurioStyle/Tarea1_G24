import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Monedas.*;
import Productos.Producto;
import Productos.ProductoEnum;
/**
 * Clase que representa a un comprador que interactúa con el expendedor de productos.
 * El comprador realiza una compra de un producto seleccionando una moneda y un tipo de producto.
 * Al realizar la compra, el comprador recibe el producto, consume el producto y obtiene el vuelto correspondiente.
 */

public class Comprador{
    private String sonido;
    private int vuelto;
    /**
     * Constructor que simula el proceso de compra de un producto desde el expendedor.
     * El comprador selecciona una moneda y un tipo de producto para comprar.
     * El producto es consumido, y el vuelto es calculado y entregado al comprador.
     *
     * @param m La moneda utilizada por el comprador para realizar el pago.
     * @param cual El número del producto que se desea comprar:
     *             1: CocaCola, 2: Sprite, 3: Fanta, 4: Super8, 5: Snickers.
     * @throws NoHayProductoException Si el número de producto es inválido o si no hay stock disponible.
     * @throws PagoIncorrectoException Si el pago no es suficiente para la compra del producto.
     */
    public Comprador(Moneda m, int cual) throws NoHayProductoException, PagoIncorrectoException {
        Expendedor exp = new Expendedor(6);
        Producto p = null;
        switch (cual){
            case 1:
                p = exp.comprarProducto(m, 1);
                break;
            case 2:
                p = exp.comprarProducto(m, 2);
                break;
            case 3:
                p = exp.comprarProducto(m, 3);
                break;
            case 4:
                p = exp.comprarProducto(m, 4);
                break;
            case 5:
                p = exp.comprarProducto(m, 5);
                break;
            default:
                throw new NoHayProductoException("Numero Invalido");
        }
        if (p != null) {
            this.sonido = p.consumir();
        }
        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }
    }
    /**
     * Método para obtener el valor total del vuelto recibido por el comprador.
     *
     * @return El valor total del vuelto en unidades de la moneda.
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    public String queCompraste() {
        if (sonido == null){
            return "nada";
        }
        else {
            return sonido;
        }
    }
}

