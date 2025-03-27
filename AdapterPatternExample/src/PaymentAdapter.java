public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Internally calling the old method
        oldPaymentGateway.payWithCard(amount);
    }
}
