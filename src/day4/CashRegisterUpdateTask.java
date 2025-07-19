package day4;

class CashRegisterUpdateTask implements Runnable {
    private final CashRegister register;
    private final int amount;
    private final String staff;
    CashRegisterUpdateTask(CashRegister register, int amount, String staff) {
        this.register = register; this.amount = amount; this.staff = staff;
    }
    public void run() { register.processPayment(amount, staff); }
}