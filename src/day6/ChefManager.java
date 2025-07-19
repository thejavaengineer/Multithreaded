package day6;

class ChefManager {
    private volatile boolean stopWorking = false;
    void stopWorking() { stopWorking = true; }
    void work() {
        System.out.println("Chef started working");
        while (!stopWorking) {
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
        System.out.println("Chef stopped working");
    }
}