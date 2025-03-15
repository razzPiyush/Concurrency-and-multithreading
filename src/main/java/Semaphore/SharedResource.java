package Semaphore;
import java.util.concurrent.Semaphore;

public class SharedResource {
    private static final Semaphore semaphore = new Semaphore(2); // Limit to 2 threads
    // At one time only 2 threads can access the resource
    // if a thread releases the resource then other thread can access it
    public void accessResource() {
        try {
            semaphore.acquire(); // Acquire a permit
            System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
            Thread.sleep(1000); // Simulate resource usage
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Thread.currentThread().getName() + " is releasing the resource.");
            semaphore.release(); // Release the permit
        }
    }
}
