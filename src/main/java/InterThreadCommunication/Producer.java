package InterThreadCommunication;

// Producer class
class Producer extends Thread {
    private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.produce(i); // Produce items from 1 to 5
            try {
                Thread.sleep(500); // Simulate time taken to produce
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}