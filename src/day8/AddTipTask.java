package day8;

class AddTipTask implements Runnable {
    private final TipJar tipJar;
    private final int[] tips;
    AddTipTask(TipJar tipJar, int... tips) {
        this.tipJar = tipJar;
        this.tips = tips;
    }
    public void run() {
        for (int tip : tips) {
            System.out.println(Thread.currentThread().getName() + " adding tip " + tip);
            tipJar.addTip(tip);
        }
    }
}