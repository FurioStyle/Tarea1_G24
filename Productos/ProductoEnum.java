package Productos;

public enum ProductoEnum {
    COCA_COLA(1000),
    SPRITE(900),
    FANTA(900),
    SUPER8(700),
    SNICKERS(800);

    private final int precio;

    ProductoEnum(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
