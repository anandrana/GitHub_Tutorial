package org.example;

public class Main {
    static {
        System.out.println("this is checking for static keyword");
    }
    public static void main(String... rana){
        System.out.println("starting the thread.....");
        Thread thread = Thread.currentThread();
        String tName=thread.getName();
        System.out.println("the thread name is "+tName);

        thread.setName("MainThread");
        System.out.println("the thread name after setting "+thread.getName());
<<<<<<< HEAD
        System.out.println("the current id is "+thread.getId());
=======
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
>>>>>>> 2d1a932565629a8f293e6f56c67be0d78c80d301
        System.out.println("thread ending....");
    }
}
