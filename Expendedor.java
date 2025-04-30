import Bebidas.*;
import Dulces.*;
import Deposito.*;
import Monedas.*;

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

    public Bebida comprarBebida(Moneda m, int x) {
        if (m == null){
            return null;
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
                    bebida = null;
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
                    while (valor/100 > 0) {
                        monVu.addMoneda(new Moneda100());
                        valor -= 100;
                    }
                    return null;
                }
            }
            else {
                while (valor/100 > 0) {
                    monVu.addMoneda(new Moneda100());
                    valor -= 100;
                }
                return null;
            }
        }
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}