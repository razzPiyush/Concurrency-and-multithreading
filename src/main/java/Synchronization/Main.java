package Synchronization;


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
