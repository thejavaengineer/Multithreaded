package day1;

/**
 * The type Waiter.
 * Waiter classes implement Runnable, and printing five steps with Thread.sleep(1000) between steps.
 */
class Waiter implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Waiter is serving soup " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Waiter interrupted while serving soup " + i);
                break;
            }
        }
    }
}