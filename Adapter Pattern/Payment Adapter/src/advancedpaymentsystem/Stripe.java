package advancedpaymentsystem;

public class Stripe implements AdvancedPaymentProcessor{
    @Override
    public void process(String id, String method) {
        if(method.equalsIgnoreCase("Stripe")){
            System.out.println("Payment processed through Stripe for id: " + id);
        }else{
            throw new RuntimeException("Payment method unrecognized");
        }
    }
}
