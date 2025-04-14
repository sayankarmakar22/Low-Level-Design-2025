package SOLID.OCP.GoodCode;

import SOLID.OCP.BadCode.Payment;

public class PaymentProcess {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
