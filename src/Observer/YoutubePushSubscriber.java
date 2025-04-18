package Observer;

public class YoutubePushSubscriber implements Subscriber{
    private String subName;

    public YoutubePushSubscriber(String name) {
        this.subName = name;
    }

    @Override
    public void update(String name) {
        System.out.println(subName + " you have a new notification \n" +"Youtube Push Subscriber Notification - "+name);
    }
}
