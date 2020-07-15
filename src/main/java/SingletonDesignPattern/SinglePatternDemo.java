package SingletonDesignPattern;

public class SinglePatternDemo {

    public static void main(String[] args){
        //SingleTon obj = new SingleTon();
        //if comment is removed gives compile time error since constructor is private

        SingleTon obj = SingleTon.getInstance();
        obj.message();


    }
}
