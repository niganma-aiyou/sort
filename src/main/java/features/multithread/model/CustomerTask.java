/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package features.multithread.model;

import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;

/**
 * 消费者线程
 *
 * @author chuweiyuan
 * @module 生产者消费者模型
 * @date 2022/8/22 9:53
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class CustomerTask implements Runnable {
    private Store store;
    public CustomerTask(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int n = store.pop();
        if( n != -1 ) {
            System.out.println("消费:" + n);
        }
    }
    /*
		// wait 唤醒以后执行的是在wait时的操作,即list.size() == 0;
		// 这时候显然不能取值,我们直接获得return -1;
		// 所以我在上面结果输出中给定了wait被唤醒的时候是"暂时不可取,等待生产者生产"
		// 其实此时我们已经可以取值了,不过是在新的线程中,而不是当前线程,当前线程只能让你理解为"暂时不可取,等待生产者生产"
		// 如果想让结果有实际意义,请将"暂时不可取,等待生产者生产"写在">>>容器空了"之后
		if( n != -1 )
			System.out.println("消费:" + n);
		*/
}
