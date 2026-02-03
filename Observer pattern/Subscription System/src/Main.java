import observers.Subscriber;
import observers.SubscriberOne;
import observers.SubscriberThree;
import observers.SubscriberTwo;
import subject.Channel;
import subject.Subject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Demo for old contents\n");
        Channel channel = new Channel();
        SubscriberOne subscriberOne = new SubscriberOne(channel);
        SubscriberTwo subscriberTwo = new SubscriberTwo(channel);
        SubscriberThree subscriberThree = new SubscriberThree(channel);

        subscriberOne.showContent();
        subscriberTwo.showContent();
        subscriberThree.showContent();

        subscriberThree.removeSubscription();
        System.out.println("Demo for New contents\n");
        channel.setContent("New Content");
        channel.notifyAllSubscriber();

        subscriberOne.showContent();
        subscriberTwo.showContent();
        subscriberThree.showContent();



    }
}