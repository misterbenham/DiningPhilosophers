package com.company;

public record Philosopher(Object leftChopstick, Object rightChopstick) implements Runnable {
        // Creates threads for new objects: left and right chopsticks.

    private synchronized void doActivity(String activity) throws InterruptedException {
        // Method parses a string to perform several activities.
        System.out.println(
                Thread.currentThread().getName() + " " + activity);
        // prints the name of the Philosopher and activity to console.
        Thread.sleep((long)(Math.random() * 3000));
        // Sleeps the threads for random times up to 3 seconds.
    }

    @Override
    public void run() {
        try {
            while (true) {
                // While loop runs through activities below.
                // activity for 'thinking'.
                doActivity("is thinking");
                synchronized (leftChopstick) {
                    // synchronized activity to 'pick up left chopstick'.
                    doActivity("picked up left chopstick");
                    synchronized (rightChopstick) {
                        // synchronized activity to 'pick up right chopstick'
                        doActivity("picked up right chopstick + eating");
                        doActivity("put down right chopstick");
                        // Activity for 'eating' and 'putting down right chopstick'.
                    }
                    doActivity("put down left chopstick + back to thinking");
                    // Breaks out of loop and activity for 'putting down left chopstick' and 'back to thinking'.
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // Catches exception and interrupts threads.
        }
    }
}
