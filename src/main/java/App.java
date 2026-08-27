public class App {
    public static void main(String[] args) {
        Order order = new Order("A-1", 3);
        System.out.println("Total: " + order.total());
    }
}

class Order {
    private final String id;
    private final int quantity;

    Order(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    int total() {
        return quantity * unitPrice;
    }
}
