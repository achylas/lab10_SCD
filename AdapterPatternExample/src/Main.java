public class Main {
    public static void main(String[] args) {
        // Creating an instance of the old payment gateway
        OldPaymentGateway oldGateway = new OldPaymentGateway();

        // Using the adapter to connect the old system with the new interface
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldGateway);

        // Processing a payment using the new interface
        System.out.println("Processing Payment using Adapter:");
        paymentProcessor.processPayment(100.00);
    }
}
