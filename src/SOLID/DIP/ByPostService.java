package SOLID.DIP;

import javax.xml.transform.Source;

public class ByPostService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending post : " + msg);
    }
}
