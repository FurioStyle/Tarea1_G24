package Productos;

public abstract class Dulce extends Producto{
    public Dulce(int x){
        super(x);
    }
    @Override
    public abstract String consumir();
}
