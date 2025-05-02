import Monedas.*;
import java.util.ArrayList;
import java.util.Collections;
import Productos.ProductoEnum;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c = null;
        m = new Moneda1000();
        ProductoEnum tipo = ProductoEnum.SNICKERS;
        c = new Comprador(m,tipo,exp);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
    }
}

