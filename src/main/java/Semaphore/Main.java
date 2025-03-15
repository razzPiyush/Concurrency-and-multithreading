package Semaphore;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create multiple threads
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> resource.accessResource(), "Thread-" + i).start();
        }
    }
}
/*
A semaphore is a synchronization tool used to control access to a shared resource by multiple threads. It allows a certain number of threads to access a resource simultaneously.

Types of Semaphores:
Binary Semaphore: Allows only one thread to access the resource at a time (similar to a mutex).
Counting Semaphore: Allows a fixed number of threads to access the resource concurrently.

Example: Using Semaphores to Limit Resource Access
 */
