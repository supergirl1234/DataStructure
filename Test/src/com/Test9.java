package com;

import java.util.concurrent.*;

class HhThread implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
public class Test9 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService=Executors.newScheduledThreadPool(3);

        HhThread myThread=new HhThread();
        for(int i=0;i<5;i++){
             // executorService.schedule(myThread,3,TimeUnit.SECONDS);//延迟3秒后执行，只执行一次
              executorService.scheduleAtFixedRate( myThread,3,2,TimeUnit.SECONDS);//多长时间后开始执行，然后再按照速率执行
        }
    }
}
