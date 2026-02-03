import legacypaymentsystem.LegacyPaymentProcessor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Credit card demo");
        LegacyPaymentProcessor paymentProcessor = new LegacyPaymentProcessor();
        paymentProcessor.process("1234", "credit");
        System.out.println("paypal method demo");
        paymentProcessor.process("1234", "paypal");
        System.out.println("Stripe method demo");
        paymentProcessor.process("1234", "Stripe");
//        System.out.println("Invalid Payment method demo");
//        paymentProcessor.process("1234", "Cash");

    }
}