package it524.thread;

public class ThreadExample2 {
    public static void main(String[] args) {

        /*

         Thread

         Allows to perform two or more tasks simultaneously

         Ex. Microsoft Outlook can check inbox for new mail while writing another one

         Two ways of creating Threads

            - Extend Thread class, but it will limit the extend capacity of class, because only one class can be extended
            - Implement Runnable interface, it requires run() method override.

        */

        // Legacy Thread
        LegacyThread legacyThread = new LegacyThread();
        legacyThread.start(); // Normally, not triggered by run function

        //legacyThread.start(); // Thread cannot be called again, needs to be create new Thread

        LegacyThread anotherLegacyThread = new LegacyThread(); // Second Thread
        anotherLegacyThread.start();

        // Runnable Thread
        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.run();

        System.out.println("I can");

    }

    static class LegacyThread extends Thread {
        // We cannot extend a class

        @Override
        public void run() {
            int count = 0;
            try {
                while(true){
                    if (count == 5)
                        break;
                    Thread.sleep(1000); // Static method, can be called anywhere. Sleep only works for the current Thread
                    System.out.println("Thread : "+ ++count);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class RunnableThread implements Runnable {
        // We can extend a class

        @Override
        public void run() {
            int count = 0;
            try {
                while(true){
                    if (count == 10)
                        break;
                    Thread.sleep(1000); // Static method, can be called anywhere. Sleep only works for the current Thread
                    System.out.println("Thread 2 : "+ ++count);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
