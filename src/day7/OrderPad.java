package day7;

import java.util.ArrayList;
import java.util.List;

class OrderPad {
    private final List<String> orders = new ArrayList<>();

    synchronized void writeOrder(String order) {
        System.out.println("Writing order " + order + " by " + Thread.currentThread().getName());
        orders.add(order);
    }

    List<String> getOrders() {
        return orders;
    }
}


