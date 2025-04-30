import Bebidas.Bebida;
import Monedas.*;

public class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cual, Expendedor exp){
        Bebida b = exp.comprarBebida(m, cual);
        if (b != null) {
            this.sonido = b.beber();
        }
        Moneda moneda;
        while ((moneda = exp.getVuelto()) != null) {
            this.vuelto += moneda.getValor();
        }
    }

    public int cuantoVuelto(){

        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}

