/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread;

/**
 * 学习线程不同状态
 *
 * @author chuweiyuan
            多线程学习
 * @date 2022/8/19 13:29
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ThreadState {
        public static void main(String[] args) throws Exception {
            MyThread2 a = new MyThread2();
            a.setName("我是定义的线程！");

            printThreadInfo(a);

            a.start();
            Thread.sleep(50);
            printThreadInfo(a);
            a.waiting = false;
            Thread.sleep(50);
            printThreadInfo(a);
            a.notice();
            Thread.sleep(50);
            printThreadInfo(a);
            while (a.isAlive()) {
                System.out.println("alive");
            }
            printThreadInfo(a);
        }

        static void printThreadInfo(Thread t) {
            System.out.println(t.getName() + " 存活:" + t.isAlive() + " 状态:" + t.getState());
        }
    }



    class MyThread2 extends Thread {
        boolean waiting = true;
        boolean ready = false;

        MyThread2() {
        }

        public void run() {
            String thrdName = Thread.currentThread().getName();
            System.out.println(thrdName + " 启动");
            while (waiting) {
                System.out.println("等待：" + waiting);
            }
            System.out.println("等待...");
            startWait();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(thrdName + " 中断。");
            }
            System.out.println(thrdName + " 结束。");
        }

        synchronized void startWait() {
            try {
                while (!ready) {
                    wait();
                }
            } catch (InterruptedException e) {
                System.out.println("wait() 中断。");
            }
        }

        synchronized void notice() {
            ready = true;
            notify();
        }


}
