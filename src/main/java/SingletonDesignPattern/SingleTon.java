package SingletonDesignPattern;

public class SingleTon {

    private static SingleTon instance = new SingleTon();

    private SingleTon(){}

    public static SingleTon getInstance(){
        return instance;
    }

    public void message(){
        System.out.println("SingleTon class");
    }


}
