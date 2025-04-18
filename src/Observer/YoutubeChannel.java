package Observer;

public interface YoutubeChannel {
    void addSubscriber(Subscriber name);
    void removeSubscriber(Subscriber name);
    void notifySubscribers();
}
