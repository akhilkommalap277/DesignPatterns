package BuilderDesignPattern;

public class VegManchuria extends Manchuria{


    @Override
    public String name() {
        return "VegManchuria";
    }

    @Override
    public float price() {
        return (float) 5.0;
    }
}
