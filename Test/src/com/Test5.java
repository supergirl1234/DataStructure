package com;

class runnable implements Runnable{


    public final  Object object=new Object();
    @Override
    public void run() {

        synchronized(object) {
            System.out.println("wait开始");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait结束");
        }
        synchronized(object) {//锁object对象
            System.out.println("notify开始");
            object.notify();
            System.out.println("notify结束");
        }


    }
}
public class Test5 {
    public static void main(String[] args) {

        Runnable runnable=new runnable();
        Thread thread1=new Thread(runnable);
      /*  Thread thread2=new Thread(com.runnable);*/
        thread1.start();
        /*thread2.start();*/
    }

}
