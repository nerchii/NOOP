package ZD_2;

public class Test {
    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount("Alice");
        MobileApp mobileApp = new MobileApp();

        DepositMoney depositMoney = new DepositMoney(acc, 100);
        mobileApp.setPaymentTransactionCMD(depositMoney);
        mobileApp.performTransaction();

//        System.out.println(acc);
    }
}
