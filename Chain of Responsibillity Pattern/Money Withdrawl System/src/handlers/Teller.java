package handlers;

import request.MoneyWithdrawlRequest;

public class Teller implements Handler{
    Handler nextHandler;
    private final String handlerName = "Teller";
    @Override
    public void process(MoneyWithdrawlRequest moneyWithdrawlRequest) {
        double amount = moneyWithdrawlRequest.getAmmount();
        if(amount < 1000){
            System.out.println("Withdrawl Succlessful!! Provided by: " + handlerName);
        }
        else{
            System.out.println("Please wait...");
            if(nextHandler != null) {
                nextHandler.process(moneyWithdrawlRequest);
            }
            else{
                System.out.println("Request rejected");
            }
        }
    }
    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
