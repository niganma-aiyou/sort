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
 * @date 2022/8/18 14:12
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class StopThreadTest {
    public static void main(String[] args) {
        int num = 0;
        StopTh st = new StopTh();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        t1.start();
        t2.start();
        //设置主线程执行50次，执行结束之后停止线程
        while (true) {
            if(num++ == 50){
                st.flagChange();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "..." + num);
        }
    }
}

class StopTh implements Runnable{

    private boolean flag = true;
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName() + "stop run" );
        }
    }
    public void flagChange(){
        flag = false;
    }
}
