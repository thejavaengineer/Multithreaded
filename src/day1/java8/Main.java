package day1.java8;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            // Chef task
            Thread chef = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Chef is preparing soup " + i);
                    try { Thread.sleep(1000); } catch (InterruptedException e) {
                        System.out.println("Chef interrupted");
                        break;
                    }
                }
            });

            // Waiter task
            Thread waiter = new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Waiter is serving soup " + i);
                    try { Thread.sleep(1000); } catch (InterruptedException e) {
                        System.out.println("Waiter interrupted");
                        break;
                    }
                }
            });

            chef.start();
            waiter.start();
            chef.join();
            waiter.join();
            System.out.println("Manager: All staff done");
        }

}
