package Deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread thread1 = new Thread(() -> resource1.methodA(resource2), "Thread-1");
        Thread thread2 = new Thread(() -> resource2.methodA(resource1), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
/*
Thread-1 locks resource1 and waits for resource2.
Thread-2 locks resource2 and waits for resource1.
Both threads are stuck, leading to a deadlock.
 */