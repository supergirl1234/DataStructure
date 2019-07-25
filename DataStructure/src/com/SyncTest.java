package com;

import java.util.concurrent.TimeUnit;

public class SyncTest  implements Runnable{

    private Object sync;

    public SyncTest(Object sync) {
        this.sync = sync;
    }

    @Override
    public void run() {
        //sync=new Object();/*有没有该语句，结果会截然不同*/
        synchronized (sync){

            System.out.println(Thread.currentThread().getName()+"开始执行");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);/*sleep不会释放对象锁*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"结束执行");
        }
    }

    public static void main(String[] args) {

        Object obj=new Object();
        SyncTest syncTest=new SyncTest(obj);
        Thread thread1=new Thread(syncTest);
        Thread thread2=new Thread(syncTest);
        Thread thread3=new Thread(syncTest);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
