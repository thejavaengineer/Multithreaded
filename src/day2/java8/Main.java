package day2.java8;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            // Chef task
            Thread chef = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Chef is preparing soup " + i);
                    try { Thread.sleep(1000); } catch (InterruptedException e) {
                        System.out.println("Chef interrupted");
                        return;
                    }
                }
            });

            // Waiter task: waits for chef to finish (using join)
            Thread waiter = new Thread(() -> {
                try {
                    System.out.println("Waiter is waiting for chef");
                    chef.join(); // Wait until chef is done
                    System.out.println("Waiter: Chef finished, starting to serve soup");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Waiter is serving soup " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Waiter interrupted");
                }
            });

            chef.start();
            waiter.start();
            chef.join();
            waiter.join();
            System.out.println("Manager: All staff done");
        }
    }

