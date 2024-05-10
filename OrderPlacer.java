public class OrderPlacer implements OrderProcessing {
    @Override
    public double calculateTotal(double price, int quantity) {
        throw new UnsupportedOperationException("OrderPlacer doesn't calculate total");
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
