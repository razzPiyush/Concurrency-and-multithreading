package InterThreadCommunication;


public class Main {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

        try {
            producer.join(); // Wait for producer to finish
            consumer.join(); // Wait for consumer to finish
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Producer and Consumer have finished their tasks.");
    }
}
/*
Inter-thread communication in Java refers to the mechanism that allows threads to coordinate their execution by sharing information. It is particularly useful in a producer-consumer scenario where one thread produces data and another consumes it.

In Java, inter-thread communication is achieved using the following methods from the Object class:

wait(): Causes the current thread to wait until another thread invokes notify() or notifyAll() on the same object.
notify(): Wakes up a single thread that is waiting on the object's monitor.
notifyAll(): Wakes up all threads that are waiting on the object's monitor.
 */