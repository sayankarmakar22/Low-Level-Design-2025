package OCP.GoodCode;

import OCP.BadCode.Payment;

public class PaymentProcess {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
