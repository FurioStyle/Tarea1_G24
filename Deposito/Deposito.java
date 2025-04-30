package Deposito;

import Bebidas.*;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> bebidas;

    public Deposito() {
        bebidas = new ArrayList();
    }

    public void addBebida(Bebida b) {
        bebidas.add(b);
    }

    public Bebida getBebida() {
        if (bebidas.size() != 0) {
            Bebida aux = bebidas.get(0);
            bebidas.remove(0);
            return aux;
        } else {
            return null;
        }
    }
}