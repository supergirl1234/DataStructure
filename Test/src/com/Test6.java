package com;

import sun.util.resources.cldr.ka.LocaleNames_ka;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test6 {

    public static void main(String[] args) {
        Lock lock=new ReentrantLock();

        Condition condition=lock.newCondition();
        for( int i=0;i<5;i++){
            Thread thread=new Thread(()->{
            try{
               lock.lock();
               condition.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }});

            thread.start();

        }
    }
}
