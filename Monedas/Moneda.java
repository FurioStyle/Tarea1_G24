package Monedas;

public abstract class Moneda implements Comparable<Moneda> {
    private int serie;

    public Moneda() {}

    public abstract int getValor();

    public Moneda getSerie() {
        return this;
    }

    @Override
    public int compareTo(Moneda otra) {
        return Integer.compare(this.getValor(), otra.getValor());
    }
}
