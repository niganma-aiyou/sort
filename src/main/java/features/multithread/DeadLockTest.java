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
 * @date 2022/8/18 14:34
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class DeadLockTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockTest1(true));
        Thread t2 = new Thread(new DeadLockTest1(false));
        t1.start();
        t2.start();
    }
}

class DeadLockTest1 implements Runnable{

    private boolean flag;
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public DeadLockTest1(boolean flag) {
        this.flag = flag;
    }
    public void run(){
        if(flag){
            synchronized(obj1){
                System.out.println("if lock1");
                synchronized (obj2) {
                    System.out.println("if lock2");
                }
            }
        }else{
            synchronized (obj2) {
                System.out.println("else lock2");
                synchronized (obj1) {
                    System.out.println("else lock1");
                }
            }
        }
    }
}
