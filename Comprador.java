import Productos.Bebida;
import Monedas.*;
import Productos.Producto;
import Productos.ProductoEnum;

public class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, ProductoEnum cual, Expendedor exp){
        Producto b = exp.comprarProducto(m, cual);
        if (b != null) {
            this.sonido = b.consumir();
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

