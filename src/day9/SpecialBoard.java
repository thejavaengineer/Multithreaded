package day9;

class SpecialBoard {
    private String specialDish = "nothing special";
    private volatile boolean specialDishSet = false;
    void setSpecialDish(String dish) {
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        System.out.println("Chef is setting special dish to " + dish);
        specialDish = dish;
        specialDishSet = true;
    }
    String getSpecialDish() {
        while (!specialDishSet) {
            // Wait until the dish is set
        }
        return specialDish;
    }
}