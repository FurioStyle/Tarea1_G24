package Depositos;

import Monedas.Moneda100;
import Productos.Producto;

import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> deposito;

    public Deposito() {
        deposito = new ArrayList<>();
    }

    public void addElemento(T b) {
        deposito.add(b);
    }

    public Producto getElemento() {
        if (!deposito.isEmpty()) {
            return (Producto) deposito.remove(0);
        } else {
            return null;
        }
    }

    public Moneda100 getVuelto(){
        if (!deposito.isEmpty()) {
            return (Moneda100) deposito.remove(0);
        } else {
            return null;
        }
    }
}