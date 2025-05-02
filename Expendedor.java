import Productos.*;
import Depositos.*;
import Monedas.*;

public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito monedaVuelto;
    private Deposito super8;
    private Deposito snickers;
    public int numeroProducto;

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

    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null){
            return null;
        }
        else{
            int valor = m.getValor();
            Producto productoSeleccionado;
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
                default:
                    productoSeleccionado = null;
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
                    return null;
                }
            }
            else {
                while (valor/100 > 0) {
                    monedaVuelto.addElemento(new Moneda100());
                    valor -= 100;
                }
                return null;
            }
        }
    }

    public Moneda getVuelto(){
        return monedaVuelto.getVuelto();
    }
}

