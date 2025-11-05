package pckg_payment;

public class PaymentModule {
    private PaymentStrategy paymentStrategy;

    public PaymentModule(PaymentStrategy ps){
        System.out.println("Some payment module...");
        this.paymentStrategy = ps;
    }


    public void preformPAyment(double amount) {
        paymentStrategy.preformPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
