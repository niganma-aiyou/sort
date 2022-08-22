/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.threadpool;

import java.util.List;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/18 17:50
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class MyWorker extends Thread{
    private String name;
    private List<Runnable> tasks;

    public MyWorker(String name , List<Runnable> tasks){
        super(name);
        this.tasks = tasks;
    }
}
