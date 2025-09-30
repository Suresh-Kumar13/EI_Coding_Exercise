public class PaymentRequest {
        private String cardNumber;
    private double amount;
    private double accountBalance;

    public PaymentRequest(String cardNumber, double amount, double accountBalance) {
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.accountBalance = accountBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

}
