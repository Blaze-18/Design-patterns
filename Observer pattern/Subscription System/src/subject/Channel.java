package subject;

import observers.Subscriber;

import java.util.ArrayList;

public class Channel implements Subject {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private String content = "Old Content";

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscriber() {
        for(Subscriber subscriber: subscribers){
            subscriber.update();
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
