package day3;

/*
//Shows data corruption when multiple threads update a shared counter.
//DishCounter: Unsynchronized, leads to race condition.
class DishCounter {
    int totalDishesServed = 0;
    void serveDish() {
        totalDishesServed++;
    }
    int totalDishesServed() { return totalDishesServed; }
}*/

/**
 * The type Dish counter.
 * then how synchronization fixes it
 *Uses @Synchronized (Kotlin)/synchronized (Java) to safely increment the total.
 */
class DishCounter {
    int totalDishesServed = 0;
    synchronized void serveDish() {
        totalDishesServed++;
    }
    int totalDishesServed() { return totalDishesServed; }
}