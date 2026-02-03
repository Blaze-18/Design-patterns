import builder.ChainBuilder;
import handlers.Handler;
import request.MoneyWithdrawlRequest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Money Withdrawl Demo");

        ChainBuilder builder = new ChainBuilder();
        Handler handle = builder.buildChain();
        MoneyWithdrawlRequest request1 = new MoneyWithdrawlRequest("1",10000, "Cash");
        MoneyWithdrawlRequest request2 = new MoneyWithdrawlRequest("2",60000, "Cash");
        MoneyWithdrawlRequest request3 = new MoneyWithdrawlRequest("3", 7000, "Transfer");
        MoneyWithdrawlRequest request4 = new MoneyWithdrawlRequest("4", 700, "Transfer");
        System.out.println("\nRequest 1: ");
        handle.process(request1);
        System.out.println("\nRequest 2: ");
        handle.process(request2);
        System.out.println("\nRequest 3: ");
        handle.process(request3);
        System.out.println("\nRequest 4: ");
        handle.process(request4);
    }
}