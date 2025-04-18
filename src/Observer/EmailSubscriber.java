package Observer;

public class EmailSubscriber implements Subscriber{
    private String subName;

    public EmailSubscriber(String name) {
        this.subName = name;
    }

    @Override
    public void update(String name) {
        System.out.println(subName + " you have a new notification \n" +"Email Subscriber Notification - "+name);
    }
}
