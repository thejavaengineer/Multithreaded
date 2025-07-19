package day6;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        ChefManager manager = new ChefManager();
        Thread chef = new Thread(manager::work);
        chef.start();
        Thread.sleep(2000);
        System.out.println("Manager interrupting chef: shift is over");
        manager.stopWorking();
        chef.join();
    }
}
