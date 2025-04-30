package Monedas;

public abstract class Moneda{
    private int serie;

    public Moneda(){
    }

    public abstract int getValor();

    public Moneda getSerie() {
        return this;
    }
}
