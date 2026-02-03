package legacypaymentsystem;

public interface PaymentProcessor {
    public void process(String id, String method);
}
