package Facade;

public class PaymentFacade {

    private Payment payment = new Payment();
    public void doPay(){
        payment.senderDetails();
        payment.receiverDetails();
        payment.processAmount();
    }

}
