package day7;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        OrderPad orderPad = new OrderPad();
        int waiterCount = 3;
        int ordersPerWaiter = 2;
        List<Thread> waiters = new ArrayList<>();
        for (int i = 0; i < waiterCount; i++) {
            int waiterIndex = i + 1;
            waiters.add(new Thread(() -> {
                for (int j = 1; j <= ordersPerWaiter; j++) {
                    orderPad.writeOrder("Waiter " + waiterIndex + ": order " + j);
                }
            }, "Waiter-" + waiterIndex));
        }
        for (Thread waiter : waiters) waiter.start();
        for (Thread waiter : waiters) waiter.join();
        System.out.println("All staff is done, order pad is " + orderPad.getOrders());
    }
}
