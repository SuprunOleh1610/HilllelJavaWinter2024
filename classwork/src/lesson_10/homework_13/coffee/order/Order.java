package lesson_10.homework_13.coffee.order;

class Order {
    private static int nextOrderNumber = 1;

    private int orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.orderNumber = nextOrderNumber++;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
