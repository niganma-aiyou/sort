/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.model;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/22 10:00
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ModelTest {
    public static void main(String[] args) {
        Store store = new Store();
        int i = 0;
        while (i< 100){
            Thread t1 = new Thread(new ProductorTask(store));
            Thread t2 = new Thread(new CustomerTask(store));
            t1.start();
            t2.start();
            i++;
        }
    }
}
