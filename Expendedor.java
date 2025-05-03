import Productos.*;
import Depositos.*;
import Monedas.*;
import Excepciones.*;
/**
 * Clase que simula un expendedor de productos. Permite la compra de bebidas y snacks
 * como CocaCola, Sprite, Fanta, Super8 y Snickers. Los productos están almacenados en depósitos
 * y el expendedor procesa pagos y entrega vuelto en monedas.
 */

public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito monedaVuelto;
    private Deposito super8;
    private Deposito snickers;
    public int numeroProducto;
    /**
     * Constructor que inicializa el expendedor con una cantidad específica de productos en stock.
     * Se crean depósitos con productos de tipo CocaCola, Sprite, Fanta, Super8 y Snickers,
     * cada uno con un número determinado de unidades.
     *
     * @param cantidad La cantidad de productos que se añadirán a cada depósito.
     */
    public Expendedor(int cantidad) {
        this.numeroProducto = cantidad;
        int serieC = 100;
        int serieS = 200;
        int serieF = 300;
        int serieSu = 400;
        int serieSn = 500;
        coca = new Deposito();
        for (int i = serieC; i < serieC + numeroProducto; i++) {
            coca.addElemento(new CocaCola(i));
        }

        sprite = new Deposito();
        for (int i = serieS; i < serieS + numeroProducto; i++) {
            sprite.addElemento(new Sprite(i));
        }
        monedaVuelto = new Deposito();

        fanta = new Deposito();
        for (int i = serieF; i < serieF + numeroProducto; i++) {
            fanta.addElemento(new Fanta(i));
        }
        super8 = new Deposito();
        for (int i = serieSu; i < serieSu + numeroProducto; i++) {
            super8.addElemento(new Super8(i));
        }
        snickers = new Deposito();
        for (int i = serieSn; i < serieSn + numeroProducto; i++) {
            snickers.addElemento(new Snickers(i));
        }

    }
    /**
     * Método para comprar un producto del expendedor. Se verifica si la moneda es válida,
     * si hay stock disponible del producto seleccionado y si el valor de la moneda es suficiente
     * para la compra. Si todo es correcto, se devuelve el producto comprado y se da el vuelto.
     *
     * @param m La moneda utilizada para realizar la compra.
     * @param cual El número del producto que se desea comprar:
     *             1: CocaCola, 2: Sprite, 3: Fanta, 4: Super8, 5: Snickers.
     * @return El producto comprado si el pago es válido y hay stock disponible.
     * @throws PagoIncorrectoException Si el valor de la moneda no es suficiente para la compra.
     * @throws NoHayProductoException Si no hay más unidades del producto seleccionado.
     */

    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException   {
        if (m == null){
            throw new PagoIncorrectoException("Moneda nula: no se puede realizar el pago");
        }
        else{
            int valor = m.getValor();
            Producto productoSeleccionado = null;
            int precio = 0;
            switch (cual){
                case 1:
                    productoSeleccionado = coca.getElemento();
                    precio = ProductoEnum.COCA_COLA.getPrecio();
                    break;
                case 2:
                    productoSeleccionado = sprite.getElemento();
                    precio = ProductoEnum.SPRITE.getPrecio();
                    break;
                case 3:
                    productoSeleccionado = fanta.getElemento();
                    precio = ProductoEnum.FANTA.getPrecio();
                    break;
                case 4:
                    productoSeleccionado = super8.getElemento();
                    precio = ProductoEnum.SUPER8.getPrecio();
                    break;
                case 5:
                    productoSeleccionado = snickers.getElemento();
                    precio = ProductoEnum.SNICKERS.getPrecio();
                    break;
            }
            if (valor >= precio) {
                if (productoSeleccionado != null) {
                    int vuelto = valor - precio;
                    while (vuelto / 100 > 0) {
                        monedaVuelto.addElemento(new Moneda100());
                        vuelto -= 100;
                    }
                    return productoSeleccionado;
                }
                else {
                    while (valor/100 > 0) {
                        monedaVuelto.addElemento(new Moneda100());
                        valor -= 100;
                    }
                    throw new NoHayProductoException("No hay producto");
                }
            }
            else {
                while (valor/100 > 0) {
                    monedaVuelto.addElemento(new Moneda100());
                    valor -= 100;
                }
                throw new PagoIncorrectoException("No hay dinero suficiente");
            }
        }
    }

    /**
     * Método para obtener el vuelto del expendedor.
     *
     * @return El vuelto en forma de monedas, si las hay.
     */
    public Moneda getVuelto(){
        return monedaVuelto.getVuelto();
    }
}

