package Productos;

public class Super8 extends Dulce {
    public Super8(int x){
        super(x);
    }
    @Override
    public String consumir(){
        return "super8";
    }
}
