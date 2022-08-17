/*
 * 版权所有 2009-2022山东新北洋信息技术股份有限公司 保留所有权利。
 */
package api.newcharacteristic;

import api.math.BigIntegerTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * TODO
 * TODO
 *
 * @author chuweiyuan
 * @module TODO
 * @date 2022/8/16 8:28
 * @copyright 2022 山东新北洋信息技术股份有限公司. All rights reserved
 */
public class LambdaTest {

    private static final Logger log = LogManager.getLogger(LambdaTest.class.getName());

    public static void main(String[] args) {
        Runnable r1 = ()->{
            log.info("早");
        };
        r1.run();

        Consumer<String> con = (String str)->{
            log.info(str);
        };

        con.accept("111111");
        Consumer<String> con2 = (str)->{
            log.info(str);
        };

        Consumer<String> con3 = str ->{
            log.info(str);
        };

        get(()->  {
            log.info("111");
            return 1;
        });



        Comparator<Integer> com = (x,y)->{
            log.info("实现函数式接口的方法");
            return Integer.compare(x,y);
        };
        log.info(com.compare(12,22));

        Comparator<Integer> com2 =(x,y)->x.compareTo(y);
        //替换为方法引用：Comparator<Integer> com2 = Integer::compareTo;
        log.info(com2.compare(12,23));

    }

    private static void get(Supplier supplier){
        supplier.get();
    }
}
