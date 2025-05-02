package Depositos;

import Productos.Bebida;
import Productos.Producto;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> productos;

    public Deposito() {
        productos = new ArrayList<>();
    }

    public void addElemento(T b) {
        productos.add(b);
    }

    public Producto getElemento() {
        if (!productos.isEmpty()) {
            return (Producto) productos.remove(0);
        } else {
            return null;
        }
    }
}