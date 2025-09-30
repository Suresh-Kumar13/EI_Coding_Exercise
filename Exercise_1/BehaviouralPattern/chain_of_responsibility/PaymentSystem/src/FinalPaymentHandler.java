public class FinalPaymentHandler extends PaymentHandler {
     @Override
    public void handle(PaymentRequest request) {
        System.out.println("Payment of Rs" + request.getAmount() + " approved successfully!");
    }
}
