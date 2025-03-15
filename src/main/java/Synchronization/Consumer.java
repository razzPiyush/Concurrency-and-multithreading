package Synchronization;

// Consumer class
class Consumer extends Thread {
    private SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.consume(); // Consume items
            try {
                Thread.sleep(500); // Simulate time taken to consume
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

