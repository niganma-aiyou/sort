/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.pool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用线程池
 *
 * @author chuweiyuan
 * @module 线程池
 * @date 2022/8/22 11:18
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class TestRunning implements Runnable {
    public static void main(String[] args) {
        System.out.println(">>>主线程开始执行");

        // 创建线程池
        // Executor pool = Executors.newSingleThreadExecutor();
        // Executor pool = Executors.newCachedThreadPool();
        // Executor pool = Executors.newFixedThreadPool(10);
        // ScheduledThreadPoolExecutor
        // Executor pooll = Executors.newScheduledThreadPool(10);
        Executor pool = new ThreadPoolExecutor(0,
                Integer.MAX_VALUE, 2L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
        TestRunning tr = new TestRunning();
        pool.execute(tr);
        System.out.println(">>>主线程执行结束");
    }

    @Override
    public void run() {
        System.out.println(">>>异步调用线程开始");
        try {
            File file = new File("D:/userBean.obj");
            // 创建Obj写入对象
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            // 创建Obj读入对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            // 创建Obj对象
            UserBean ub = new UserBean();
            ub.setId(002244);
            ub.setSex("男");
            ub.setUserName("userName");
            System.out.println(">>>对象创建完成");
            // 将ub对象写入文件
            if (file.exists()) {
                file.delete();
                System.out.println(">>>文件存在,已删除");
            }
            oos.writeObject(ub);
            System.out.println(">>>文件已写入");
            UserBean userBean = (UserBean) ois.readObject();
            System.out.println(userBean);

            System.out.println(">>>文件读取完毕");
            System.out.println(">>>异步线程结束");
            oos.flush();
            oos.close();
            ois.close();
        } catch (Exception e) {
            throw new RuntimeException(">>>IO操作问题,异步线程结束");
        }
    }
}