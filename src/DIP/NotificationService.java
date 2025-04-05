package DIP;

public class NotificationService {

    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel userNotificationChannel) {
        this.notificationChannel = userNotificationChannel;
    }
    public void sendNotification(String message) {
        notificationChannel.send(message);
    }
}
