package com;

import java.util.concurrent.*;

class MyThread implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<7;i++){

            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}

public class Test7 {
    public static void main(String[] args) {

        ExecutorService executorService=new ThreadPoolExecutor(3,5,
                2000,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
       MyThread myThread=new MyThread();
        for(int i=0;i<5;i++){
            executorService.execute(myThread);
        }
        executorService.shutdown();
    }
}
