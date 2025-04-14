package Facade;

public class Payment implements MakePayment{

    @Override
    public void senderDetails() {
        System.out.println("getting sender details...");
    }

    @Override
    public void receiverDetails() {
        System.out.println("getting receiver details...");
    }

    @Override
    public void processAmount() {
        System.out.println("processing amount...");
    }
}
