package AdapterDesignPattern;

public class atmDeposit implements AdvancedBank {
    @Override
    public void depositAtBank(int amount) {

    }

    @Override
    public void depositAtAtm(int amount) {
        System.out.println("atm deposit amount " + amount);

    }
}
