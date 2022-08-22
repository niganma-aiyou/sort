/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread;

import javax.print.DocFlavor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/17 16:19
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class CallableFutrueTest {
    public static void main(String[] args) {
        //创建对象
        CallableTest callableTest = new CallableTest();
        //使用FutureTask包装CallableTest对象
        FutureTask<Integer> futureTask = new FutureTask<>(callableTest);

        for (int i = 0; i < 100; i++) {
            //输出主线程
            System.out.println(Thread.currentThread().getName()+ "主线程的i为：" + i);
            if(i==30){
                Thread thread = new Thread(futureTask,"子线程");
                thread.start();
            }
        }

        //获取并输出子线程call()方法的返回值
        try{
            System.out.println("子线程的返回值为："+futureTask.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}

class CallableTest implements Callable<Integer>{
    //复写call方法，call()方法具有返回值

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的变量值为"+i);
        }
        return i;
    }
}
