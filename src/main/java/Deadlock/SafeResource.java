package Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeResource {
    private final Lock lock = new ReentrantLock();

    public void methodA(SafeResource other) {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock on methodA.");
                Thread.sleep(100);

                if (other.lock.tryLock()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired lock on other resource.");
                    } finally {
                        other.lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not acquire lock on other resource.");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not acquire lock on methodA.");
        }
    }
}
