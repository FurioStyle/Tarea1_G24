import Bebidas.*;
import Dulces.*;
import Deposito.*;
import Monedas.*;
import Excepciones.*;


public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public int numeroBebida;
    public int precioBebida;

    public Expendedor(int x, int coste){
        this.precioBebida = coste;
        this.numeroBebida = x;
        int seriec = 100;
        int series = 200;
        coca = new Deposito();
        for (int i = seriec; i < seriec + numeroBebida; i++) {
            coca.addBebida(new CocaCola(i));
        }

        sprite = new Deposito();
        for (int i = series; i < series + numeroBebida; i++) {
            sprite.addBebida(new Sprite(i));
        }
        monVu = new DepositoM();

    }

    public Bebida comprarBebida(Moneda m, int x) throws PagoIncorrectoException, NoHayProductoException{
        if (m == null){
            throw new PagoIncorrectoException("Moneda nula: no se puede realizar el pago");
        }
        else{
            int valor = m.getValor();
            Bebida bebida;
            if (valor >= precioBebida) {
                if (x == COCA) {
                    bebida = coca.getBebida();
                } else if (x == SPRITE) {
                    bebida = sprite.getBebida();
                } else {
                    int valorDevuelto = m.getValor();
                    while (valorDevuelto >= 100) {
                        monVu.addMoneda(new Moneda100());
                        valorDevuelto -= 100;
                    }
                    throw new NoHayProductoException("Numero Invalido");
                }
                if (bebida != null) {
                    int vuelto = valor - precioBebida;
                    while (vuelto / 100 > 0) {
                        monVu.addMoneda(new Moneda100());
                        vuelto -= 100;
                    }
                    return bebida;
                }
                else {
                    int valorVuelto = m.getValor();
                    while (valor/100 > 0) {
                        monVu.addMoneda(new Moneda100());
                        valor -= 100;
                    }
                    throw new NoHayProductoException("No hay producto");
                }
            }
            else {
                int valorVuelto = m.getValor();
                while (valor/100 > 0) {
                    monVu.addMoneda(new Moneda100());
                    valor -= 100;
                }
                throw new PagoIncorrectoException("No hay dinero suficiente");
            }
        }
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}