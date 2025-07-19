package day4;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        CashRegister register = new CashRegister();
        Thread waiter1 = new Thread(new CashRegisterUpdateTask(register, 1000, "Waiter 1"));
        Thread waiter2 = new Thread(new CashRegisterUpdateTask(register, 1500, "Waiter 2"));
        waiter1.start();
        waiter2.start();
        waiter1.join();
        waiter2.join();
    }
}
