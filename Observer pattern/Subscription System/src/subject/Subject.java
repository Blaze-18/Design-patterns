package subject;

import observers.Subscriber;

public interface Subject {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifyAllSubscriber();
    public void setContent(String content);
    public String getContent();
}
