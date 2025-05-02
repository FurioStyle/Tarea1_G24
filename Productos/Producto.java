package Productos;

public abstract class Producto {
    private int serie;
    public Producto(int x){
        this.serie = x;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String consumir();
}
