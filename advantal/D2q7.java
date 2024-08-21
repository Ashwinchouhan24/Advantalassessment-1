package advantal;
public class D2q7 {
    public static void main(String[] args) {
        final Resource resource1 = new Resource("Resource 1");
        final Resource resource2 = new Resource("Resource 2");

        // Thread 1 and Thread 2 try to lock resources in the same order
        Thread thread1 = new Thread(() -> acquireLocks(resource1, resource2));
        Thread thread2 = new Thread(() -> acquireLocks(resource1, resource2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execution completed without deadlock.");
    }

    private static void acquireLocks(Resource res1, Resource res2) {
        synchronized (res1) {
            System.out.println(Thread.currentThread().getName() + " locked " + res1.getName());

            try {
                // Simulating some work
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " locked " + res2.getName());
            }
        }
    }
}

// Simple Resource class
class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

