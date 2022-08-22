/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.threadpool;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chuweiyuan
 * @module 线程池
 * @date 2022/8/18 17:53
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class MyThreadPool {
    // 1:任务队列   集合  需要控制线程安全问题


    private List<Runnable> tasks = Collections.synchronizedList(new LinkedList<>());
    //2:当前线程数量

    private int num;
    //3:核心线程数量

    private int corePoolSize;
    //4:最大线程数量

    private int maxSize;
    //5:任务队列的长度

    private int workSize;

    public MyThreadPool(int corePoolSize, int maxSize, int workSize) {
        this.corePoolSize = corePoolSize;
        this.maxSize = maxSize;
        this.workSize = workSize;
    }

    public void submit(Runnable r) {
        //判断当前集合中任务的数量，是否超过了最大任务数量
        if (tasks.size() >= workSize) {
            System.out.println("任务r被丢弃了...");
        } else {
            tasks.add(r);
            execTask(r);
        }
    }

    private void execTask(Runnable runnable) {
        //判断当前线程池中的线程数量是否超过核心线程数
        if (num < corePoolSize) {
            new MyWorker("核心线程数量：" + num, tasks).start();
            System.out.println("当前线程属于核心线程");
            num++;
        } else if (num < maxSize) {
            new MyWorker("非核心线程数" + num, tasks).start();
            System.out.println("当前线程数位于最大线程");
            num++;
        } else {
            System.out.println("任务" + runnable + "被缓存了");
        }
    }
}
