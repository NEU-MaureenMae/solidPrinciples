public class EmailNotifier implements OrderNotification{
    @Override
    public void sendNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
