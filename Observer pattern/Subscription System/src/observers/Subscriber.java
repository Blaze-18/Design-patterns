package observers;

public interface Subscriber {
    public void update();
    public void removeSubscription();
    public void showContent();
}
