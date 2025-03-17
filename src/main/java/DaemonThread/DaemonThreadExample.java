package DaemonThread;

public class DaemonThreadExample {
    public static void main(String[] args) {
        // lambda expression due to functional interface
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        daemonThread.setDaemon(true); // Mark this thread as a daemon thread
        daemonThread.start();

        System.out.println("Main thread is running...");
        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread is finished.");
    }
}

/*
A daemon thread is a background thread in Java that runs in support of user threads. The JVM exits as soon as all user
threads are complete, even if daemon threads are still running.

Characteristics:
-Used for background tasks like garbage collection, monitoring, etc.
-Automatically terminated when all user threads finish execution.
-Must be set as daemon using setDaemon(true) before the thread starts.
*/
