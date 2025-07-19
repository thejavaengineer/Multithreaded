package day1;

/**
 * The type Chef.
 * Chef classes implement Runnable, and printing five steps with Thread.sleep(1000) between steps.
 */
class Chef implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("day1.Chef is preparing soup " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {
                System.out.println("day1.Chef interrupted while preparing soup " + i);
                break;
            }
        }
    }
}



