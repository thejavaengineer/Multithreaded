package day3;

/**
 * 3. Example3: Data Integrity & Synchronization – Dish Counter
 * Shows data corruption when multiple threads update a shared counter, then how synchronization fixes it.
 * Race conditions with unsynchronized data, and fixing it via synchronized methods
 * or blocks to ensure only one thread updates the counter at a time
 */
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        DishCounter dishCounter = new DishCounter();
        //Two waiter threads each serve dishes 100,000 times.
        Thread waiter1 = new Thread(new UpdatedDishCounterTask(dishCounter));
        Thread waiter2 = new Thread(new UpdatedDishCounterTask(dishCounter));
        waiter1.start();
        waiter2.start();
        waiter1.join();
        waiter2.join();
        System.out.println("Manager is done, total dishes served today " + dishCounter.totalDishesServed());
    }
}
