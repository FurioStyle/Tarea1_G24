package Productos;

public class Fanta extends Bebida {
    public Fanta(int x){
        super(x);
    }
    @Override
    public String consumir(){
        return "fanta";
    }
}
