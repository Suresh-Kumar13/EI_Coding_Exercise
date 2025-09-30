public class FinalPaymentHandler extends PaymentHandler {
     @Override
    public void handle(PaymentRequest request) {
        System.out.println("🎉 Payment of $" + request.getAmount() + " approved successfully!");
    }
}
