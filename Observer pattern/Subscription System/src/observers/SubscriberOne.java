package observers;

import subject.Channel;
import subject.Subject;

public class SubscriberOne implements Subscriber {
    private Subject subject;
    private String content = "Old content";
    private final String name = "Sub1";

    public SubscriberOne(Subject subject){
        this.subject = subject;
        subject.addSubscriber(this);
    }

    @Override
    public void update() {
        this.content = subject.getContent();
    }

    @Override
    public void removeSubscription() {
        System.out.println("Removing subscription from " + name);
        subject.removeSubscriber(this);
    }

    @Override
    public void showContent() {
        System.out.println("Name:" + name +" Content: " + content);
    }
}
