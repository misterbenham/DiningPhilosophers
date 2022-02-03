***Dining Philosophers***

This application simulates a classic synchronization problem in programming where deadlock can occur if not handled
correctly. A group of 5 philosophers are sitting at a table, spending their time eating and thinking. However, there are
only 5 chopsticks on the table for them to share, and they must have one chopstick in each hand to eat. After eating for
a random amount of time, the philosopher puts down both chopsticks and starts thinking. They have agreed to always pick
up the chopstick nearest their left hand first, then the chopstick nearest their right hand. After eating for a random
amount of time, a philosopher will return both chopsticks to their original positions on the table.


Philosopher Class:

We need to create a new record that will store the left and right chopsticks as objects. This record, called Philosopher,
implements runnable to run on separate threads.


Main Class:

Firstly, we need to create an array of Philosophers, named Philosopher[], with a total of 5. Then, we create a new object
array for the chopsticks which will be the same number as the philosophers (5).