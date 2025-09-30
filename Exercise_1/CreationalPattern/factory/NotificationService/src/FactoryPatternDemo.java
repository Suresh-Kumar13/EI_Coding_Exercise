public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("email");
        email.send("Factory Pattern implemented successfully!");

        Notification sms = NotificationFactory.createNotification("sms");
        sms.send("Your OTP is 1234");

        Notification push = NotificationFactory.createNotification("push");
        push.send("New update available!");
    }
}