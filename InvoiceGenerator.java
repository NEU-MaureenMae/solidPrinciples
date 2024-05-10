public class InvoiceGenerator implements OrderNotification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Invoice generated: " + message);
    }
}
