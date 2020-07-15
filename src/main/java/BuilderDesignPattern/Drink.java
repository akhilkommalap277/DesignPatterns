package BuilderDesignPattern;

public abstract class Drink implements Item{
    public Packing pack(){
        return new Bottle();
    }

    public abstract float price();
}
