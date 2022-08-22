/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.model;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *用锁实现store类
 *
 * @author chuweiyuan
 * @module 生产者消费者模式
 * @date 2022/8/22 10:10
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LockStore {
    LinkedList<Integer> list = new LinkedList<>();
    private final int max = 10 ;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    /**
     * 生产者向队列中放东西(放入队尾)
     * @author chuweiyuan
     * @date 2022/8/22 10:14
     * @param n : 需要存放的数
     **/
    public void push(int n) {
        lock.lock();
        try {

            // 如果队列满了,等待消费者去队列中拿走
            if (list.size() >= max) {
                System.out.println(">>>容器满了");
                // 线程挂起
                condition.await();
            }
            // 如果队列不满,可以放入
            else {
                System.out.println("生产" + n);
                list.add(n);
                // 唤醒*取的线程(此时只有空的状态是在wait中)*
                condition.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 消费者在队列中取东西(从队头)
     * @author chuweiyuan
     * @date 2022/8/22 10:17
     * @return {@link  }
     **/
    public int pop() {
        lock.lock();
        try {
            // 如果队列空了,取消取的操作
            if (list.size() == 0) {
                System.out.println(">>>容器空了");
                // 线程挂起
                condition.await();
            }
            // 如果不是空直接取走
            else {
                // 取队列中的头
                int n = list.poll();
                System.out.println("取走" + n);
                // 既然取走了,说明不是满的了
                // 唤醒在list上等待的线程(此时只有满的状态是在wait中)
                condition.signal();
                return n;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return -1;
    }
}
