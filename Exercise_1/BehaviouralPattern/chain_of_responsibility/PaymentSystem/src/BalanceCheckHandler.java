public class BalanceCheckHandler extends PaymentHandler{
     @Override
    public void handle(PaymentRequest request) {
        if (request.getAccountBalance() < request.getAmount()) {
            System.out.println("❌ Insufficient Balance.");
            return;
        }
        System.out.println("✅ Balance Check Passed.");
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
