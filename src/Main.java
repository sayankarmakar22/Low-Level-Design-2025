import SOLID.OCP.BadCode.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.makePayment(100, "credit card");
    }
}