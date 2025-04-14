package SOLID.DIP;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending Sms : " + msg);
    }
}
