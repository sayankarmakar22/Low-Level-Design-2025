package SOLID.OCP.BadCode;

public class Payment {

    public void makePayment(int amount,String type) {
        if(type.equals("credit card")) {
            System.out.println("payment has done against the amount of " + amount + " credit card");
        }
        else if(type.equals("debit card")) {
            System.out.println("payment has done against the amount of " + amount + " debit card");
        }
        else if(type.equals("upi")) {
            System.out.println("payment has done against the amount of " + amount + " Upi");
        }

    }
}
