package payments.plugins.creditcard;

import payments.PaymentProcessor;

public class CreditCardPayment implements PaymentProcessor {
    public void validateDetails(String details) {
        System.out.println("Validating Credit card details for: " + details);
    }

    public void processPayment(double amount) {
        System.out.println("Processing Credit card Payment of $" + amount);
    }
}
