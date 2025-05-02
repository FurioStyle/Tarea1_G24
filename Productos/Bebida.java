package Productos;

public abstract class Bebida extends Producto{
    public Bebida(int x){
        super(x);
    }
    @Override
    public abstract String consumir();
}