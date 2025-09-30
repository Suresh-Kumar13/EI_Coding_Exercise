// CORDemo.java

public class CORDemo {
    public static void main(String[] args) {
        // Setup chain
        PaymentHandler cardValidator = new CardValidationHandler();
        PaymentHandler fraudChecker = new FraudCheckHandler();
        PaymentHandler balanceChecker = new BalanceCheckHandler();
        PaymentHandler finalHandler = new FinalPaymentHandler();

        cardValidator.setNextHandler(fraudChecker);
        fraudChecker.setNextHandler(balanceChecker);
        balanceChecker.setNextHandler(finalHandler);

        System.out.println("CASE 1: Valid Payment");
        PaymentRequest req1 = new PaymentRequest("1234567890123456", 200, 500);
        cardValidator.handle(req1);

        System.out.println("\nCASE 2: Invalid Card");
        PaymentRequest req2 = new PaymentRequest("12345", 100, 300);
        cardValidator.handle(req2);

        System.out.println("\nCASE 3: Fraudulent Card");
        PaymentRequest req3 = new PaymentRequest("0000123412341234", 100, 500);
        cardValidator.handle(req3);

        System.out.println("\nCASE 4: Insufficient Balance");
        PaymentRequest req4 = new PaymentRequest("9876543212345678", 1000, 300);
        cardValidator.handle(req4);
    }
}
