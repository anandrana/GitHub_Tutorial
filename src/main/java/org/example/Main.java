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
        System.out.println("thread ending....");
    }
}