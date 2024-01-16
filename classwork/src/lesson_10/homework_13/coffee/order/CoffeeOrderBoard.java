package lesson_10.homework_13.coffee.order;

import java.util.ArrayList;
import java.util.List;

class CoffeeOrderBoard {
    private List<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
    }

    public void add(String customerName) {
        Order newOrder = new Order(customerName);
        orders.add(newOrder);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order nextOrder = orders.removeFirst();
            System.out.println("Delivering order #" + nextOrder.getOrderNumber() + " for " + nextOrder.getCustomerName());
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                foundOrder = order;
                break;
            }
        }

        if (foundOrder != null) {
            orders.remove(foundOrder);
            System.out.println("Delivering order #" + foundOrder.getOrderNumber() + " for " + foundOrder.getCustomerName());
        } else {
            System.out.println("Order #" + orderNumber + " not found.");
        }
    }

    public void draw() {
        System.out.println("------------------");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}