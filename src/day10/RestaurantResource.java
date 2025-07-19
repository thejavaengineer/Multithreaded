package day10;

class RestaurantResource {
    private final Object orderPadLock = new Object();
    private final Object knifeSetLock = new Object();
    private final Object reservationBookLock = new Object();
    private int orderCounter = 0;
    private int knifeCounter = 0;
    private int reservationCounter = 0;

    void incrementOrderCounter() {
        synchronized(orderPadLock) {
            System.out.println(Thread.currentThread().getName() + " is acquiring order pad");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            orderCounter++;
            System.out.println(Thread.currentThread().getName() + " is releasing order pad");
        }
    }

    void incrementKnifeCounter() {
        synchronized(knifeSetLock) {
            System.out.println(Thread.currentThread().getName() + " is acquiring knife");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            knifeCounter++;
            System.out.println(Thread.currentThread().getName() + " is releasing knife");
        }
    }

    void incrementReservationCounter() {
        synchronized(reservationBookLock) {
            System.out.println(Thread.currentThread().getName() + " is acquiring reservation");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            reservationCounter++;
            System.out.println(Thread.currentThread().getName() + " is releasing reservation");
        }
    }
}
