/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.volatiletest;
import java.util.concurrent.TimeUnit;
/**
 * 可见性
 *
 * @author chuweiyuan
 * @module volatile 相关
 * @date 2022/8/22 13:26
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class SeeableTest {

        static class Data{
            volatile   int number =0;
            // int number =0;
            public void add()
            {
                this.number = number +1;
            }
        }
        //启动两个线程，一个work线程，一个main线程，work线程修改number值后，查看main线程的number
        private static void testVolatile() {
            Data myData = new Data();

            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"\t come in");
                try {
                    TimeUnit.SECONDS.sleep(2);
                    myData.add();
                    System.out.println(Thread.currentThread().getName()+"\t update number value :"+myData.number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "workThread").start();

            //第2个线程，main线程
            while (myData.number == 0){
                //main线程还在找0
            }
            System.out.println(Thread.currentThread().getName()+"\t mission is over");
            System.out.println(Thread.currentThread().getName()+"\t mission is over，main get number is:"+myData.number);
        }
        public static void main(String[] args) {
            testVolatile();
        }

}
