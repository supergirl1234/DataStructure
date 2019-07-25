package com;

import java.util.concurrent.TimeUnit;

public class JoinTask implements Runnable {

    @Override
    public void run() {
        System.out.println("子线程开始执行");
        try {

            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程执行完毕");
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTask joinTask = new JoinTask();
        Thread thread1 = new Thread(joinTask);
        System.out.println("主线程开始执行");
        thread1.start();
        //thread1.join();/*join是谁调谁阻塞，join会释放对象锁*/
        System.out.println("主线程执行完毕");
    }
}
