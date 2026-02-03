package legacypaymentsystem;

public class LegacyPaymentProcessor implements PaymentProcessor{
    PaymentAdapter paymentAdapter;
    @Override
    public void process(String id, String method) {
        if(method.equalsIgnoreCase("Credit")){
            System.out.println("Payment processed through credit card for id: " + id);

        } else if (method.equalsIgnoreCase("paypal") || method.equalsIgnoreCase("Stripe")  ) {
            paymentAdapter = new PaymentAdapter(method);
            paymentAdapter.process(id, method);
        } else{
            throw new RuntimeException("Payment method unrecognized");
        }

    }
}
