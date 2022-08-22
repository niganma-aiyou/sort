/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.model;

/**
 *生产者线程类
 *
 * @author chuweiyuan
 * @module 生产者消费者模式
 * @date 2022/8/22 9:48
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ProductorTask implements Runnable {
    private Store store;
    public ProductorTask(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int n  = (int) (Math.random() * 100);

        store.push(n);
    }
}
