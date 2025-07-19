package day2;

/**
 * The type Cooking task.
 * CookingTask: Chef prepares soup (5 rounds, 1-second sleep).
 */
class CookingTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Chef is preparing soup " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {
                System.out.println("Cooking interrupted at soup " + i);
                break;
            }
        }
    }
}
