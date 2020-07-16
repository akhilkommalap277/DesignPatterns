package AdapterDesignPattern;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        DepositAdapter depositAdapter = new DepositAdapter();
        depositAdapter.deposit("atm",500);
        depositAdapter.deposit("bank",700);

    }

}
