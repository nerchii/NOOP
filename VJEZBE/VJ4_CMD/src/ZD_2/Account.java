package ZD_2;

public abstract class Account {
    private int id;
    private static int cntID = 231 ;
    protected String name;
    protected double balance;

    protected Account(String name) {
        this.id = cntID++;
        this.name = name;
        this.balance = 10000;
    }
    public double getBalance() {
        return balance;
    }
    public abstract void depositMoneh(double amount);

    public abstract double withdrawMoneh(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
