package day2;

/**
 * The type Serving task.
 * ServingTask1: Waiter checks multiple times, interrupts chef if not done after max tries, then serves whatever’s ready.
 * ServingTask2: Waiter keeps polling at intervals if the chef is still alive, then serves once done.
 * ServingTask3: Waiter uses join() to simply wait for Chef's thread to finish, then serves soup.
 */
class ServingTask implements Runnable {
    Thread chefThread;
    ServingTask(Thread chefThread) { this.chefThread = chefThread; }
    public void run() {
        try {
            System.out.println("Waiter is waiting for chef to prepare soup");
            chefThread.join();
        } catch (InterruptedException e) {
            System.out.println("Waiter interrupted while waiting for chef");
        }
        System.out.println("Waiter is serving soup");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Waiter is serving soup " + i);
        }
    }
}