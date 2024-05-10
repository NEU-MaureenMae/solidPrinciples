public class OrderCalculator implements OrderProcessing{
    @Override
    public double calculateTotal(double price, int quantity) {
        double total = price * quantity;
        return total;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
