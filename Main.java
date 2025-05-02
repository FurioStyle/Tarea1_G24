import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Monedas.*;


public class Main {
    public static void main(String[] args) throws NoHayProductoException, PagoIncorrectoException {
        Moneda m = null;
        Comprador c = null;
        m = new Moneda1000();
        // Elija un articulo
        // 1 = CocaCola
        c = new Comprador(m, 1);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
        // 2 = Sprite
        c = new Comprador(m, 2);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
        // 3 = Fanta
        c = new Comprador(m, 3);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
        // 4 = Super8
        c = new Comprador(m, 4);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
        // 5 = Snickers
        c = new Comprador(m, 5);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());

        // Excepciones

        // No hay dinero suficiente

        // m = new Moneda100();
        // c = new Comprador(m,1);

        // Numero Invalido

        // m = new Moneda1000();
        // c = new Comprador(m,7);

        //Moneda Nula

        // m = null;
        // c = new Comprador(m,1);
    }
}

