import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Monedas.*;
import Productos.Producto;
import Productos.ProductoEnum;

public class Comprador{
    private String sonido;
    private int vuelto;

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

