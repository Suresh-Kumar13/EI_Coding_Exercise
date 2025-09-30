public class EmailJob implements Job {
    private String recipient;

    public EmailJob(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void execute() {
        System.out.println("Sending email to: " + recipient);
    }
}