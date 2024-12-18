package payments.plugins.upi;

import payments.PaymentProcessor;

public class UpiPayment implements PaymentProcessor {
    public void validateDetails(String details) {
        System.out.println("Validating UPI ID: " + details);
    }

    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
