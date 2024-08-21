package advantal;
public class D2q2 {
    public static void main(String[] args) {
        // Shared counter object
        Counter counter = new Counter();
        
        // Create two threads that will increment the counter
        Thread thread1 = new Thread(new CounterIncrementer(counter));
        Thread thread2 = new Thread(new CounterIncrementer(counter));
        
        // Start both threads
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print the final value of the counter
        System.out.println("Final counter value: " + counter.getValue());
    }
}

// Counter class with a synchronized method to increment the value
class Counter {
    private int value = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        value++;
    }

    // Method to get the current value of the counter
    public int getValue() {
        return value;
    }
}

// Runnable that increments the counter
class CounterIncrementer implements Runnable {
    private Counter counter;

    // Constructor
    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        // Increment the counter 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

