package day8;

class TipJar {
    private int total = 100;
    void addTip(int tip) {
        int newSum = total + tip;
        try { Thread.sleep(10); } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
        total = newSum;
    }
    int getTotal() { return total; }
}