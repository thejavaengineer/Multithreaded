package day5;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = new Restaurant();
        Thread chef = new Thread(restaurant::prepareMeal);
        Thread waiter = new Thread(restaurant::serveMeal);
        chef.start();
        waiter.start();
        chef.join();
        waiter.join();
    }
}
