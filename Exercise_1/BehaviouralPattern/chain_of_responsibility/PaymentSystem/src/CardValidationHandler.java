public class CardValidationHandler extends PaymentHandler {
     @Override
    public void handle(PaymentRequest request) {
        if (request.getCardNumber() == null || request.getCardNumber().length() != 16) {
            System.out.println("Invalid Card Number.");
            return;
        }
        System.out.println("Card Validation Passed.");
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
