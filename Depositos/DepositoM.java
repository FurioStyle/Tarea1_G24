package Depositos;

import Monedas.*;
import java.util.ArrayList;

public class DepositoM{
    private ArrayList<Moneda100> monVu;
    public DepositoM(){
        monVu = new ArrayList<>();
    }

    public Moneda100 getMoneda(){
        if (monVu.size() != 0) {
            Moneda100 aux = monVu.get(0);
            monVu.remove(0);
            return aux;
        }
        else{
            return null;
        }
    }

    public void addMoneda(Moneda100 m){
        monVu.add(m);
    }
}
