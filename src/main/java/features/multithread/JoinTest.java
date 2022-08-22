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
 * @date 2022/8/18 14:08
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        YieldDemo ms = new YieldDemo();
        Thread t1 = new Thread(ms,"张三吃完还剩");
        Thread t2 = new Thread(ms,"李四吃完还剩");
        Thread t3 = new Thread(ms,"王五吃完还剩");
        t1.start();

        t1.join();
        t2.start();
        t3.start();
        System.out.println( "主线程");
    }
}
