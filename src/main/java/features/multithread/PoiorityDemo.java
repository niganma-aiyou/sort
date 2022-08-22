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
 * @date 2022/8/22 8:29
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class PoiorityDemo {
    public static void main(String[] args) {
        Thread min=new Thread(){
            public void run(){
                for (int i=0;i<10000;i++){
                    System.out.println("min");
                }
            }
        };
        Thread norm=new Thread(){
            public void run(){
                for (int i=0;i<10000;i++){
                    System.out.println("nor");
                }
            }
        };
        Thread max=new Thread(){
            public void run(){
                for (int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };
        min.setPriority(Thread.MIN_PRIORITY);
//        norm.setPriority(Thread.NORM_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}
