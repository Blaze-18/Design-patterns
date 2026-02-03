package legacypaymentsystem;

import advancedpaymentsystem.AdvancedPaymentProcessor;
import advancedpaymentsystem.Paypal;
import advancedpaymentsystem.Stripe;

public class PaymentAdapter implements PaymentProcessor{
    private AdvancedPaymentProcessor advancedPaymentProcessor;
    public PaymentAdapter(String method){
        if(method.equalsIgnoreCase("Paypal")){
            advancedPaymentProcessor = new Paypal();
        } else if (method.equalsIgnoreCase("Stripe")) {
            advancedPaymentProcessor = new Stripe();
        }
    }
    @Override
    public void process(String id, String method) {
        if(method.equalsIgnoreCase("Paypal")){
            advancedPaymentProcessor.process(id, method);
        } else if (method.equalsIgnoreCase("Stripe")) {
            advancedPaymentProcessor.process(id, method);
        }else{
            throw new RuntimeException("Payment method unrecognized");
        }
    }
}
