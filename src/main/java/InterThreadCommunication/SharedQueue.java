package InterThreadCommunication;

public class SharedQueue {
    private int item = -1; // Shared item
    private boolean available = false; // Whether an item is available

    // Method for the producer to produce an item
    public synchronized void produce(int value) {
        while (available) {
            try {
                wait(); // Wait until the item is consumed
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        item = value;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer
    }

    // Method for the consumer to consume an item
    public synchronized void consume() {
        while (!available) {
            try {
                wait(); // Wait until an item is produced
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); // Notify the producer
    }
}
