package day8;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        TipJar tipJar = new TipJar();
        Thread alice = new Thread(new AddTipTask(tipJar, 10, 20, 30));
        Thread bob = new Thread(new AddTipTask(tipJar, 5, 15));
        alice.start();
        bob.start();
        alice.join();
        bob.join();
        System.out.println("Total tip is " + tipJar.getTotal());
    }
}
