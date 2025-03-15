package Multithreading;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Thread using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");

        // Thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("Thread-2");

        // Start threads
        thread1.start();
        thread2.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}