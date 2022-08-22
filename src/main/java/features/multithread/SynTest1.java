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
 * @date 2022/8/17 16:54
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class SynTest1 {
    public static void main(String[] args) {
        YieldDemo yieldDemo = new YieldDemo();
        Thread t1 = new Thread(yieldDemo,"张三吃完还剩");
        Thread t2 = new Thread(yieldDemo,"李四吃完还剩");
        Thread t3 = new Thread(yieldDemo,"王五吃完还剩");
        t1.start();
        t2.start();
        t3.start();
    }
}
class YieldDemo implements Runnable {
    int count = 20;

    @Override
    public void run() {
        while (true) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + count-- + "个瓜");
                if (count % 2 == 0) {
                    Thread.yield();
                }
            }
        }
    }
}