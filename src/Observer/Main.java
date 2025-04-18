package Observer;

public class Main {
    public static void main(String[] args) {
        YtChannel sayan = new YtChannel();
        YoutubePushSubscriber s1 = new YoutubePushSubscriber("ram");
        YoutubePushSubscriber s2 = new YoutubePushSubscriber("sam");
        EmailSubscriber e1 = new EmailSubscriber("jodu");

        System.out.println("-- adding two subscriber in sayan subscriber list --");
        sayan.addSubscriber(s1);
        sayan.addSubscriber(s2);
        sayan.addSubscriber(e1);
        System.out.println("-- notify all of them --");
        sayan.uploadContent("LLD course has started");
        System.out.println("-- remove one of them from subscriber list --");
        sayan.removeSubscriber(s1);
        System.out.println("-- notify rest subscriber--");
        sayan.uploadContent("updated LLD course has finished");

    }
}
