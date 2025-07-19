package day1;

/**
 * 1. Basic Thread: Chef and Waiter Working Simultaneously
 * Single-thread vs multi-thread: With threads, tasks run in parallel (e.g., chef prepares while waiter serves),
 * instead of waiting for one to finish before the other starts
 */
public class Driver {

    /**
     * Runs two tasks (Chef prepares soup, Waiter serves soup) simultaneously using two threads.
     *
     * @param args the input arguments
     * @throws InterruptedException the interrupted exception
     * Handles possible InterruptedException.
     */
    public static void main(String[] args) throws InterruptedException {
        Thread chef = new Thread(new Chef());
        Thread waiter = new Thread(new Waiter());
        //Creates two Thread instances, starts both.
        chef.start();
        waiter.start();
        //Calls join() so the main thread waits for staff to finish.
        chef.join();
        waiter.join();
        System.out.println("Manager is done, all staff are done");
    }
}
