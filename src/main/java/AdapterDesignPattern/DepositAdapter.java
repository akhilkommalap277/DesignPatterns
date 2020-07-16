package AdapterDesignPattern;

public class DepositAdapter implements Bank{

    AdvancedBank advancedBank;
    @Override
    public void deposit(String depositType, int amount) {

        if (depositType.equalsIgnoreCase("atm")) {
            advancedBank = new atmDeposit();
            advancedBank.depositAtAtm(amount);
        }
        else if (depositType.equalsIgnoreCase("bank")) {
            advancedBank = new BankDeposit();
            advancedBank.depositAtBank(amount);
        }
        else
            advancedBank=null;

    }
}
