package com;

import java.util.concurrent.*;

class YourThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for(int i=0;i<6;i++){

            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        return Thread.currentThread().getName()+"执行完毕";
    }
}
public class Test8 {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(3, 5,
                2000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
        YourThread myThread = new YourThread();
        for (int i = 0; i < 5; i++) {

            executorService.submit(myThread);
          /* Future future=executorService.submit(myThread);//用Future来接收  与 不用Future来接收，结果运行有很大差别
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }*/
        }
            executorService.shutdown();
    }
}

