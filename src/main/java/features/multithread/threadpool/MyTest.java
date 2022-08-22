/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.threadpool;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/19 8:04
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class MyTest {
    public static void main(String[] args) {

        /*
        创建线程池类对象
        提交多个任务
         */
        MyThreadPool myThreadPool = new MyThreadPool(2,4,20);

        /*
        提交多个任务
         */
        for (int i = 0; i < 30; i++) {
            /*
            创建任务对象，并提交给线程池
             */
            MyTask my = new MyTask(i);
            myThreadPool.submit(my);
        }
    }
}
