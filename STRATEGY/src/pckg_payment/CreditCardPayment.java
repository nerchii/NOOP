package pckg_payment;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void preformPayment(double amount) {
        System.out.println("Credit card payment");

    }
}
