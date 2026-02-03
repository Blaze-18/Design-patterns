package request;

public class MoneyWithdrawlRequest {
    private String accountNumber;
    private double ammount;
    private String requestType;

    public MoneyWithdrawlRequest(String accountNumber, double ammount, String requestType) {
        this.accountNumber = accountNumber;
        this.ammount = ammount;
        this.requestType = requestType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmmount() {
        return ammount;
    }

    public String getRequestType() {
        return requestType;
    }
}
