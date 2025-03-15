package Multithreading;

// Using Runnable Interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*
We use runnable interface, as in java we cannot extend 2 classes
like class A extends B, Thread
so, we use implementation of runnable interface
now we cna use class A extends B implements Runnable

Also, runnable interface is a functional interface, functional interface has only one method defined, and we
can also implement the method in interface itself, so we can use lambda expression, instead of creating a class
separately, we can implement in main using lambda expression(->)
 */