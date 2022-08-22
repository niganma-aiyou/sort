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
 * @date 2022/8/17 15:16
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建两个线程
        ThreadDemo td = new ThreadDemo("张三");
        ThreadDemo td2 = new ThreadDemo("李四");

        //执行多线程特有方法，如果使用td.run()；也会执行，但会以单线程方式执行

        td.start();
        td2.start();

        //主线程
        for (int i = 0; i < 5; i++) {
            System.out.println("main"+":run"+i);
        }
    }
}


//继承Thread类

class ThreadDemo extends Thread{

    //设置线程名称

    ThreadDemo(String name){
        super(name);
    }

    //重写run方法

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(this.getName() + "：run" + i);
            //currentThread()  获取当前线程对象（静态）。  getName（） 获取线程名称。
        }
    }
}
