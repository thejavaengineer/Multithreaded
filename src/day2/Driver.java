package day2;

/**
 * Shows how a waiter waits for a chef to finish before serving, with three waiting strategies.
 * Thread coordination (join()), polling and interrupting to simulate real-world waiting, and handling dependencies between concurrent tasks
 */
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Thread chef = new Thread(new CookingTask());
        Thread waiter = new Thread(new ServingTask(chef));
        chef.start();
        waiter.start();
        chef.join();
        waiter.join();
        System.out.println("Manager is done, all staff are done");
    }
}