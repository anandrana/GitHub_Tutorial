package org.example;

//using Thread class...
public class MyAnotherThread extends Thread{

    public void run(){
        for(int i=10;i>0;i--){
            System.out.println("the another thread value of i is "+i);
        }
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
    }

}
