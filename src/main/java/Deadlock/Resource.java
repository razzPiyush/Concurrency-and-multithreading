package Deadlock;

public class Resource {
    public synchronized void methodA(Resource other) {
        System.out.println(Thread.currentThread().getName() + " is executing methodA.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        other.methodB(); // Tries to acquire lock on another resource
    }

    public synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + " is executing methodB.");
    }
}
