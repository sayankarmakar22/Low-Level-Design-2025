package SOLID.SRP.GoodCode;



public class SendNotification {

    public void notify(Invoice invoice){
        System.out.println("sending notification to .. " + invoice.phn_no);
    }
}
