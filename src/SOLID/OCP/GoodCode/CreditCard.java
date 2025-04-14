package SOLID.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("payment has done successfully via credit card " + " Amount : " + amount);
    }
}
