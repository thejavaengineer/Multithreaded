package day10;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        RestaurantResource resource = new RestaurantResource();

        Runnable waiterTask = () -> { for (int i = 0; i < 2; i++) resource.incrementOrderCounter(); };
        Runnable chefTask = () -> { for (int i = 0; i < 2; i++) resource.incrementKnifeCounter(); };
        Runnable hostTask = () -> { for (int i = 0; i < 2; i++) resource.incrementReservationCounter(); };

        Thread waiter1 = new Thread(waiterTask, "Waiter-1");
        Thread waiter2 = new Thread(waiterTask, "Waiter-2");
        Thread chef1 = new Thread(chefTask, "Chef-1");
        Thread chef2 = new Thread(chefTask, "Chef-2");
        Thread host1 = new Thread(hostTask, "Host-1");
        Thread host2 = new Thread(hostTask, "Host-2");

        waiter1.start(); waiter2.start(); chef1.start(); chef2.start(); host1.start(); host2.start();
        waiter1.join(); waiter2.join(); chef1.join(); chef2.join(); host1.join(); host2.join();

        System.out.println("Done");
    }
}
