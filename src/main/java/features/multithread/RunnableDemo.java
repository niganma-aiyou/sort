/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 15:56
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class RunnableDemo {
    public static void main(String[] args) {
        RunTest runTest = new RunTest();
        //建立线程对象
        Thread t1 = new Thread(runTest);
        Thread t2 = new Thread(runTest);
        //开启线程并调用main方法
        t1.start();
        t2.start();
    }
}
//定义类实现runnable接口

class RunTest implements Runnable{
    private int tick = 20;
    //覆盖runnable接口的run方法，并将线程要运行的代码放到run中

    @Override
    public void run() {
        while (true){
            if (tick>0){
                System.out.println(Thread.currentThread().getName()+"..."+tick--);
            }
        }
    }
}
