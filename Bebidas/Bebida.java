package Bebidas;

public abstract class Bebida{
    private int serie;

    public Bebida(int x){
        this.serie = x;
    }

    public abstract String beber();

    public int getSerie() {
        return serie;
    }
}