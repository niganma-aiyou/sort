/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.volatiletest;
import java.util.concurrent.TimeUnit;
/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/22 13:31
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class NotAtomic {

        static class Data{
            volatile   int number =0;
            public void add()
            {
                this.number = number +1;
            }
        }
        private static void testAtomic() throws InterruptedException {
            Data myData = new Data();

            for (int i = 0; i < 10; i++) {
                new Thread(() ->{
                    for (int j = 0; j < 1000; j++) {
                        myData.add();
                    }
                },"addPlusThread:"+ i).start();
            }
            //等待上边20个线程结束后(预计5秒肯定结束了)，在main线程中获取最后的number
            TimeUnit.SECONDS.sleep(10);
            while (Thread.activeCount() > 2){
                Thread.yield();
            }
            System.out.println("final value："+myData.number);
        }
        public static void main(String[] args) throws InterruptedException {
            testAtomic();
        }

}
