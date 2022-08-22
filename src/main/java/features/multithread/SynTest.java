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
 * @date 2022/8/17 16:49
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class SynTest {
    public static void main(String[] args) {
        new Thread(new CountDown(),"倒计时").start();
    }
}
class CountDown implements Runnable{

    int time = 10;
    @Override
    public void run() {
        while (true){
            if(time >= 0){
                System.out.println(Thread.currentThread().getName()+":"+time--);
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}