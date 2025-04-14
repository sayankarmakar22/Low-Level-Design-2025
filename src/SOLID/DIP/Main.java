package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new NotificationService(new EmailService());
        email.sendNotification("hello from sayan email");

        NotificationService sms = new NotificationService(new SMSService());
        sms.sendNotification("hello from sayan sms");

        NotificationService post = new NotificationService(new ByPostService());
        post.sendNotification("hello from sayan post");
    }
}
