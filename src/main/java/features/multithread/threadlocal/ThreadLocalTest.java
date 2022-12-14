/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.threadlocal;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/22 13:38
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ThreadLocalTest {

        // ①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值

        private static ThreadLocal<Object> seqNum = new ThreadLocal<Object>() {
            public Integer initialValue() {
                return 0;
            }
        };

        // ②获取下一个序列值
        public int getNextNum() {
            seqNum.set((Integer) seqNum.get() + 1);
            return (Integer) seqNum.get();
        }

        public static void main(String[] args) {
            ThreadLocalTest sn = new ThreadLocalTest();
            // ③ 3个线程共享sn，各自产生序列号
            TestClient t1 = new TestClient(sn);
            TestClient t2 = new TestClient(sn);
            TestClient t3 = new TestClient(sn);
            new Thread(t1).start();
            new Thread(t2).start();
            new Thread(t3).start();
        }
    }

    class TestClient implements Runnable {
        private ThreadLocalTest sn;

        public TestClient(ThreadLocalTest sn) {
            super();
            this.sn = sn;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                // ④每个线程打出3个序列值
                System.out.println("thread[" + Thread.currentThread().getName() + "] sn[" + sn.getNextNum() + "]");
            }
        }


}
