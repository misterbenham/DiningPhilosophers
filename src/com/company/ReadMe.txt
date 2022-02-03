***Dining Philosophers***

This application simulates a classic synchronization problem in programming where deadlock can occur if not handled
correctly. A group of 5 philosophers are sitting at a table, spending their time eating and thinking. However, there are
only 5 chopsticks on the table for them to share, and they must have one chopstick in each hand to eat. After eating for
a random amount of time, the philosopher puts down both chopsticks and starts thinking. They have agreed to always pick
up the chopstick nearest their left hand first, then the chopstick nearest their right hand. After eating for a random
amount of time, a philosopher will return both chopsticks to their original positions on the table.


Philosopher Class:

We need to create a new record that will store the left and right chopsticks as objects. This record, called Philosopher,
implements runnable to run on separate threads. A method, called 'doActivity', parses a string called 'activity' and will
instruct a Philosopher to perform an activity; think, pick up left chopstick, pick up right chopstick, eat or put down
their chopsticks. Each action (thread) is suspended for 3 seconds, so that the order of execution is random.

The run() method implements the Philosopher record. In a while loop, the first activity that every Philosopher performs
is 'thinking'. We can use the word 'do' to call an activity as a string (doActivity = "is thinking"). Philosophers randomly
acquire the left chopsticks, so we can use the keyword 'synchronized' to lock it so that another philosopher cannot acquire it
for use in their right hand. We then use the same synchronized keyword for the right chopstick, which can only be picked
up if not used by another Philosopher in their left hand. The philosopher can now eat. Once the Philosopher has finished
eating, they put down the right chopstick and we break out of the while loop. When we break out of the loop, the Philosopher
puts down the left chopstick and goes back to thinking.

Synchronizing these activities which occur at random times ensures that Philosophers can only pick up a left chopstick if it
has not been locked (in use). If a Philosopher acquires a left chopstick, they can then randomly acquire a right chopstick,
if not locked (in use), eat their food and the put down the right chopstick, then left chopstick and go back to thinking.


Main Class:

To start the process, we need to create an array of Philosophers, named Philosopher[], with a total of 5. Then, we create a
new object array for the chopsticks which will be the same number as the philosophers (5). The first for loop will run through
the number of chopsticks (5) and create a new object. Another for loop runs through each Philosopher (5) and randomly passes
each a left chopstick that they attempt to lock using the synchronized keyword. A thread called 'p' is created for all 5
Philosophers, each with their own ID, and the process is started.

TO USE:

- Press 'Run' to run the program.
- Watch all Philosophers start thinking.
- Watch Philosophers randomly try to acquire the left chopstick, followed by the right to eat.
- Watch Philosophers go back to thinking after eating and putting their chopstick back down.
- The cycle is endless.