package payments;

public interface PaymentProcessor {
    public void validateDetails(String details);

    public void processPayment(double amount);
}
