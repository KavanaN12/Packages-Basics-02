import payments.*;
import payments.manager.*;
import payments.plugins.creditcard.*;
import payments.plugins.upi.*;

public class TestPaymentGateway {
    public static void main(String[] args) {
        PaymentGateway p = new PaymentGateway();
        CreditCardPayment c = new CreditCardPayment();
        p.add(c);
        c.validateDetails("Kavana N/Reserve Bank");
        c.processPayment(1000);
        UpiPayment u = new UpiPayment();
        p.add(u);
        u.validateDetails("Kavana S/State Bank");
        u.processPayment(700);
        p.add(u);
    }
}
