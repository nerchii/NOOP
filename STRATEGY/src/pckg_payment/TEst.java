package pckg_payment;

public class TEst {
    public static void main(String[] args) {
        PaymentModule pm = new PaymentModule(new CreditCardPayment());

        pm.preformPAyment(23.45);

        pm.setPaymentStrategy(new PayPalPayment());

        pm.preformPAyment(2354.453);
    }
}
