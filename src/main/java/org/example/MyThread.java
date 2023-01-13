package org.example;

//using Runnable Interface...
public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("run method ...");

        for(int i=1;i<=10;i++){
            System.out.println("value of i is "+ i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {

        //Thread class implements Runnable interface internally

        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);

        //object of AnotherThread

        MyAnotherThread myAnotherThread=new MyAnotherThread();

        thread.start();
        myAnotherThread.start();
    }
}
