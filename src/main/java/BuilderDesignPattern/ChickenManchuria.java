package BuilderDesignPattern;

public class ChickenManchuria extends Manchuria{
    @Override
    public String name() {
        return "Chicken Manchuria";
    }

    @Override
    public float price() {
        return (float) 10.0;
    }
}
