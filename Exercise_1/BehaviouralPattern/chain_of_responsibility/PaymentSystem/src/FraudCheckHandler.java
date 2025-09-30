public class FraudCheckHandler extends PaymentHandler{
    @Override
    public void handle(PaymentRequest request) {
        if (request.getCardNumber().startsWith("0000")) {
            System.out.println("Fraudulent transaction detected.");
            return;
        }
        System.out.println("Fraud Check Passed.");
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
