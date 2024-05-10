public class OrderTest {
    public static void main(String[] args) {
        OrderProcessing orderProcessor = new OrderCalculator();
        OrderNotification emailNotifier = new EmailNotifier();
        OrderNotification invoiceGenerator = new InvoiceGenerator();

        double total = orderProcessor.calculateTotal(10.0, 2);
        orderProcessor.placeOrder("John Doe", "123 Main St");

        // Use calculated total if needed
        invoiceGenerator.sendNotification("Order total: $" + total);

        emailNotifier.sendNotification("Order confirmation for John Doe");
    }
}
