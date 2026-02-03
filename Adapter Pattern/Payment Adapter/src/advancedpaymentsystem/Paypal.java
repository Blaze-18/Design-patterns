package advancedpaymentsystem;

public class Paypal implements AdvancedPaymentProcessor{
    @Override
    public void process(String id, String method) {
        if(method.equalsIgnoreCase("paypal")){
            System.out.println("Payment processed through paypal for id: " + id);
        }else{
            throw new RuntimeException("Payment method unrecognized");
        }
    }
}
