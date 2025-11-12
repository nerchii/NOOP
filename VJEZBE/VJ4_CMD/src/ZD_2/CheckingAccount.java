package ZD_2;

public class CheckingAccount extends Account{

    protected CheckingAccount(String name) {
        super(name);
    }
    @Override
    public void depositMoneh(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " on checking account " + this.name);

    }

    @Override
    public double withdrawMoneh(double amount) {
        if (this.balance - amount < 0){
            System.out.println("You don't have enough money!");
            return 0;
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + " from checking account " + this.name);
            return amount;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
