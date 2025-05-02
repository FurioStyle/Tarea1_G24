package Productos;

public class CocaCola extends Bebida{
    public CocaCola(int x){
        super(x);
    }
    @Override
    public String consumir(){
        return "cocacola";
    }

}
