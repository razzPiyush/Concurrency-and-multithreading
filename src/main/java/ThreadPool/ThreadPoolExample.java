package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            threadPool.execute(new Task(i)); // Pass each task to the thread pool
        }

        threadPool.shutdown(); // Shutdown the thread pool after all tasks are submitted
    }
}

/*
A thread pool is a group of pre-created and reusable threads that manage the execution of tasks. It is part of the
java.util.concurrent package, specifically managed by the Executor and ExecutorService interfaces. Instead of creating
a new thread for each task, tasks are submitted to the thread pool, which assigns them to available threads.

Key Features of Thread Pools
1) Reusability: Threads are reused for multiple tasks, reducing the overhead of thread creation and destruction.
2) Performance: Tasks are queued, and threads are efficiently managed to optimize performance.
3) Resource Management: Limits the number of threads to prevent overloading the system.
4) Scalability: Easily adapts to the workload by creating a fixed or dynamic number of threads.
5) Ease of Use: Provides simple APIs to manage threads and tasks.
 */