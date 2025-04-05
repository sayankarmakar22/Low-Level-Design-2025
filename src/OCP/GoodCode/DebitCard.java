package OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("payment has done successfully via debit card " + " Amount : " + amount);
    }
}
