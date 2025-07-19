package day5;

class Restaurant {
    private boolean mealIsReady = false;
    void prepareMeal() {
        System.out.println("Chef is preparing soup");
        System.out.println("Chef is done preparing soup");
        mealIsReady = true;
    }
    void serveMeal() {
        while (!mealIsReady) {
            System.out.println("Waiter is waiting for soup to be ready");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
        System.out.println("Waiter is serving soup");
    }
}