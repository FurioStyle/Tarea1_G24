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
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        ArrayList<Moneda> lista = new ArrayList<>();
        lista.add(new Moneda500());
        lista.add(new Moneda100());
        lista.add(new Moneda1000());

        Collections.sort(lista);

        for (int i = 0; i < lista.size(); i++) {
            Moneda money = lista.get(i);
            System.out.println(money.getValor());
        }


    }
}

