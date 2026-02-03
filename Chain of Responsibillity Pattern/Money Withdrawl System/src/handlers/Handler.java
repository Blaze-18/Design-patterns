package handlers;

import request.MoneyWithdrawlRequest;

public interface Handler {
    public void process(MoneyWithdrawlRequest moneyWithdrawlRequest);
    public void setNext(Handler nextHandler);
}
