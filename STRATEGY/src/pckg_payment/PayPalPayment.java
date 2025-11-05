package pckg_payment;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void preformPayment(double amount) {
        System.out.println("Pay with paypal");

    }
}
