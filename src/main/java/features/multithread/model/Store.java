/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.model;

import java.util.LinkedList;

/**
 * 模拟存储队列
 *
 * @author chuweiyuan
 * @module 生产者消费者模式
 * @date 2022/8/22 9:35
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class Store {
    LinkedList<Integer> list = new LinkedList<>();
    private final int max = 10;

    /**
     * 生产者将东西放入队列尾部
     * @author chuweiyuan
     * @date 2022/8/22 9:37
     * @param n : 生产者生产的东西
     **/
    public void push(int n){
        try {
            //锁住队列
            synchronized (list){
                //如果队列满了，等待消费者拿走
                if (list.size()>=max){
                    System.out.println("容器满了");
                    list.wait();
                }else {
                    //如果队列不满，可以放入
                    System.out.println("生产"+n);
                    list.add(n);
                    //唤醒取得线程（在list上有等待的线程）
                    list.notifyAll();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     *消费者从队伍头取东西
     * @author chuweiyuan
     * @date 2022/8/22 9:43
     * @return {@link int }
     **/
    public int pop(){
        try {
            synchronized (list){
                if (!list.isEmpty()) {
                    //取走队列顶部元素
                    int n = list.poll();
                    System.out.println("取走"+n);
                    list.notifyAll();
                    return n;
                } else {
                    System.out.println("容器空了");
                    System.out.println("等待生产者生产......");
                    list.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
