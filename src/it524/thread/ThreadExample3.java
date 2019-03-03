package it524.thread;

public class ThreadExample3 {
    public static void main(String[] args) {

        // Lambda Version

        Thread t1 = new Thread(() ->{

            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        });

        /*

        Two Kinds of Threads

        Daemon and Application Threads

        Daemon : JVM will stop an application when all non-deamon
        threads have finished execution not waiting for the deamon threads to finish


        */

        t1.setDaemon(true);
        t1.run();

        System.out.println("I can");

    }
}
