package app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by FOX_duo on 2017/9/7.
 */
public class ThreadTest {


    public  static void  main (String [] args)
    {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i=0;i<10 ;i++)

        {
            final int index = i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index+"name =" +Thread.currentThread().getName());
                    try {
                        Thread.sleep(index * 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
    }



}
