package day4;

class CashRegister {
    synchronized void processPayment(int amount, String staff) {
        System.out.println("Staff " + staff + " updating register with payment " + amount);
        try { Thread.sleep(1000); } catch (InterruptedException e) {
            System.out.println("Staff " + staff + " interrupted while updating register");
        }
        System.out.println("Staff " + staff + " updated register with payment " + amount);
    }
}