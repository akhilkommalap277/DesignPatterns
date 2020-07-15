package BuilderDesignPattern;

public abstract class Manchuria implements Item{

    public Packing pack(){
        return new wrap();
    }

    public abstract float price();




}
