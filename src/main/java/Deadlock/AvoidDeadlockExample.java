package Deadlock;

public class AvoidDeadlockExample {
    public static void main(String[] args) {
        SafeResource resource1 = new SafeResource();
        SafeResource resource2 = new SafeResource();

        Thread thread1 = new Thread(() -> resource1.methodA(resource2), "Thread-1");
        Thread thread2 = new Thread(() -> resource2.methodA(resource1), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
/*
Strategies to avoid deadlocks include:

Lock Ordering: Always acquire locks in a consistent, predefined order.
Try-Lock: Use tryLock to avoid indefinite blocking.
Timeouts: Set time limits for acquiring locks.
 */