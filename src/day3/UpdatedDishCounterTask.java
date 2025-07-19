package day3;

/**
 * The type Updated dish counter task.
 *  threads each serve dishes 100,000 times.
 */
class UpdatedDishCounterTask implements Runnable {
    private final DishCounter dishCounter;
    UpdatedDishCounterTask(DishCounter dishCounter) {
        this.dishCounter = dishCounter;
    }
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            dishCounter.serveDish();
        }
    }
}
