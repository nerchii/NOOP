package ZD_2;

public class DepositMoney implements PaymentTransactionCMD{

    private Account account;
    private double amount;

    public DepositMoney(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }


    @Override
    public void execute() {
        account.depositMoneh(amount);

    }

    @Override
    public void undo() {
        account.withdrawMoneh(amount);

    }

    @Override
    public void redo() {
        execute();
    }
}
