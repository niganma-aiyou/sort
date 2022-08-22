/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.executort;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 *newCachedThreadPool练习
 *
 * @author chuweiyuan
 * @module java内置线程池练习
 * @date 2022/8/19 9:03
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class CashedThreadPoolTest {
    public static void main(String[] args) {
        //test02();
        test01();
    }

    /**
     *练习newCachedThreadPool
     */
    private static void test01(){
        /*使用工厂类获取线程池对象
        /强制】线程池不允许使用Executors取创建，而是通过ThreadPoolExecutor的方式，
         这样的处理方式能让同学更加明确线程池的运行规则，避免资源被耗尽的风险

         newCachedThreadPool()返回的是一个ThreadPoolExecutor对象
         SynchronousQueue是blockingQueue的一种，线程安全的
         线程中传递对象，可以使用synchronousQueue
         */
        ExecutorService es = Executors.newCachedThreadPool();
        //2.提交任务
        for (int i = 0; i < 10; i++) {
            es.submit(new MyRunnable(i));
        }
    }

    private static void test02(){
        //1.使用工厂类获取线程池对象
        ExecutorService es = Executors.newCachedThreadPool(new ThreadFactory() {
            int n = 1 ;
            @Override
            public Thread newThread(@NotNull Runnable r) {
                return new Thread(r,"自定义线程名称"+n++);
            }
        });

        //提交任务
        for (int i = 0;  i <= 10 ; i++) {
            es.submit(new MyRunnable(i));
        }
    }
}

class MyRunnable implements Runnable{
    private int id ;
    public MyRunnable(int id){
        this.id = id ;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+"执行了任务..."+id);
    }
}
