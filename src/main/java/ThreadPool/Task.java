package ThreadPool;

// Runnable implementation for a task
class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate task execution
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}