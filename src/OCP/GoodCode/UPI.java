package OCP.GoodCode;

public class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("payment has done successfully via UPI " +  " Amount : " + amount);
    }
}
