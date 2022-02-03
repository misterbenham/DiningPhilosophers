package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        final Philosopher[] philosophers = new Philosopher[5];
        // Creates 5 philosophers and puts them into an array called 'Philosopher'.
        Object[] chopsticks = new Object[philosophers.length];
        // Creates 5 chopsticks and puts them into an array called 'Object'.

        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Object();
        }
        // for loop runs through number of chopsticks.

        for (int i = 0; i < philosophers.length; i++) {
            // for loop runs through number of philosophers.

            Object leftChopstick = chopsticks[i];
            Object rightChopstick = chopsticks[(i + 1) % chopsticks.length];
            // Assigns the chopstick to either left or right.

            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightChopstick, leftChopstick);
                // if statement assigns the right chopstick.
            } else {
                philosophers[i] = new Philosopher(leftChopstick, rightChopstick);
                // else assigns left chopstick.
            }

            Thread p
                    = new Thread(philosophers[i], "Philosopher " + (i + 1));
            p.start();
            // New threads created for each Philosopher with their name and ID. Thread starts.
        }
    }

}
