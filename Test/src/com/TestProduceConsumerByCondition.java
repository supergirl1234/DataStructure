package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Goods{

    private String name;
    private int count;
    private int maxCount;
    private Lock lock=new ReentrantLock();
    /*消费者等待队列*/
    private Condition consumerCondition=lock.newCondition();
    private  Condition produceCondition=lock.newCondition();

    public Goods(int maxCount) {
        this.maxCount = maxCount;
    }
    @Override
    public String toString() {
        return "com.Goods{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
    public  void setGoods(String name){

        lock.lock();
        try {
            /*商品数量达到最大值，生产者线程进入生产者等待队列*/
            while (count == maxCount) {
                System.out.println(Thread.currentThread().getName()+"还有很多商品，请等待.....");
                try {
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.name=name;
            count++;
            System.out.println(Thread.currentThread().getName()+"生产"+toString());
            /*唤醒处于消费者队列的线程*/
            consumerCondition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void  getGoods(){
        try{
            lock.lock();
            while(count==0){
                System.out.println(Thread.currentThread().getName()+"还没有商品生产");
                consumerCondition.await();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
            System.out.println(Thread.currentThread().getName()+"消费"+toString());
            /*唤醒处于生产者队列的线程*/
            produceCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


}

class Producer implements Runnable{

    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){

            this.goods.setGoods("口红");
        }
    }
}

class Consumer implements Runnable{

    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){

            this.goods.getGoods();
        }
    }
}
public class TestProduceConsumerByCondition {

    public static void main(String[] args) {

        Goods goods=new Goods(20);
        Producer producer=new Producer(goods);
        Consumer consumer=new Consumer(goods);

        List<Thread> list=new ArrayList<>();
        for(int i=0;i<10;i++){

            Thread thread=new Thread(consumer,"消费者"+i);
            list.add(thread);
        }

        for(int i=0;i<5;i++){

            Thread thread=new Thread(producer,"生产者"+i);
            list.add(thread);
        }
        for(Thread item:list){

            item.start();
        }
    }

}
