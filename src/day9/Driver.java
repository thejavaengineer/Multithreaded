package day9;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        SpecialBoard specialBoard = new SpecialBoard();
        Thread chef = new Thread(() -> specialBoard.setSpecialDish("chicken"));
        Thread waiter = new Thread(() -> System.out.println("Special dish is " + specialBoard.getSpecialDish()));
        chef.start();
        waiter.start();
        chef.join();
        waiter.join();
    }
}
