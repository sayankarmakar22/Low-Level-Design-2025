package OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcess paymentProcess = new PaymentProcess();
        paymentProcess.processPayment(new UPI(),1200);
    }
}
