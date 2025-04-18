package Observer;

import java.util.ArrayList;
import java.util.List;

public class YtChannel implements YoutubeChannel{
    private List<Subscriber> subscriberList;
    String content;
    public YtChannel() {
        subscriberList = new ArrayList<>();

    }
    @Override
    public void addSubscriber(Subscriber name) {
        subscriberList.add(name);
    }

    @Override
    public void removeSubscriber(Subscriber name) {
        subscriberList.remove(name);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(content);
        }

    }
    public void uploadContent(String content){
        this.content = content;
        notifySubscribers();
    }
}
