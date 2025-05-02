import Monedas.*;


public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador c = null;
        m = new Moneda1000();
        // Elija un articulo
        // 1 = CocaCola
        // 2 = Sprite
        // 3 = Fanta
        // 4 = Super8
        // 5 = Snickers
        c = new Comprador(m, 2 ,exp);
        System.out.println(c.queCompraste()+", "+c.cuantoVuelto());
    }
}

