import Monedas.*;
import Productos.Producto;
import Productos.ProductoEnum;

public class Comprador{
    private String sonido;
    private int vuelto;
    private Expendedor exp = new Expendedor(6);
    
    public Comprador(Moneda m, int cual){
        Producto p = null;
        switch (cual){
            case 1:
                p = exp.comprarProducto(m, ProductoEnum.COCA_COLA);
                break;
            case 2:
                p = exp.comprarProducto(m, ProductoEnum.SPRITE);
                break;
            case 3:
                p = exp.comprarProducto(m, ProductoEnum.FANTA);
                break;
            case 4:
                p = exp.comprarProducto(m, ProductoEnum.SUPER8);
                break;
            case 5:
                p = exp.comprarProducto(m, ProductoEnum.SNICKERS);
                break;
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

