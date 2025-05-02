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

    public Producto comprarProducto(Moneda m, ProductoEnum tipo) {
        if (m == null){
            return null;
        }
        else{
            int valor = m.getValor();
            Producto productoSeleccionado;
            if (valor >= tipo.getPrecio()) {
                if (tipo == ProductoEnum.COCA_COLA) {
                    productoSeleccionado = coca.getElemento();
                }
                else if (tipo == ProductoEnum.SPRITE) {
                    productoSeleccionado = sprite.getElemento();
                }
                else if(tipo == ProductoEnum.FANTA) {
                    productoSeleccionado = fanta.getElemento();
                }
                else if(tipo == ProductoEnum.SUPER8) {
                    productoSeleccionado = super8.getElemento();
                }
                else if(tipo == ProductoEnum.SNICKERS) {
                    productoSeleccionado = snickers.getElemento();
                }
                else {
                    productoSeleccionado = null;
                }

                if (productoSeleccionado != null) {
                    int vuelto = valor - tipo.getPrecio();
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

