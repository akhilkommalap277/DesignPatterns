package AdapterDesignPattern;

public class BankDeposit implements AdvancedBank {


    @Override
    public void depositAtBank(int amount) {
        System.out.println("deposit amount " + amount);
    }

    @Override
    public void depositAtAtm(int amount) {

    }
}
