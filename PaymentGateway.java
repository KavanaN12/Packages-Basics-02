package payments.manager;

import java.util.HashMap;
import java.util.Map;

import payments.PaymentProcessor;
import payments.plugins.creditcard.CreditCardPayment;
import payments.plugins.upi.UpiPayment;

public class PaymentGateway {
    Map<Integer, PaymentProcessor> p = new HashMap<Integer, PaymentProcessor>();
    static Integer k = 1;

    public void add(CreditCardPayment obj) {
        boolean key = false;
        for (int i = 0; i < k; i++) {
            if (obj == p.get(i)) {
                key = true;
            }
        }
        if (key == false) {
            System.out.println("Selected Payment mode: Credit Card Payment...");
            p.put(k, obj);
            k++;
        }
    }

    public void add(UpiPayment obj) {
        boolean key = false;
        for (int i = 0; i < k; i++) {
            if (obj == p.get(i)) {
                key = true;
            }
        }
        if (key == false) {
            System.out.println("Selected Payment mode: UPI payment method...");
            p.put(k, obj);
            k++;
        }
    }
}
