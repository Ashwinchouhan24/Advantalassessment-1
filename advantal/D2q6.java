
package advantal;
import java.util.concurrent.atomic.AtomicInteger;

public class D2q6 {
    public static void main(String[] args) {
        // Create an AtomicInteger instance
        AtomicInteger counter = new AtomicInteger(0);

        // Create and start multiple threads that increment the counter
        Thread t1 = new Thread(new IncrementTask(counter));
        Thread t2 = new Thread(new IncrementTask(counter));
        Thread t3 = new Thread(new IncrementTask(counter));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter.get());
    }
}

// Runnable task that increments the AtomicInteger counter
class IncrementTask implements Runnable {
    private AtomicInteger counter;

    public IncrementTask(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementAndGet();  // Atomically increment the counter
        }
    }
}
